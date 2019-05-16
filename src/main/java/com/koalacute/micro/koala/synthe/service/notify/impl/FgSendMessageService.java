package com.koalacute.micro.koala.synthe.service.notify.impl;

import com.koalacute.micro.koala.synthe.dto.FgSendMessageDto;
import com.koalacute.micro.koala.synthe.dto.notify.fg.FgData;
import com.koalacute.micro.koala.synthe.dto.response.FgResponse;
import com.koalacute.micro.koala.synthe.entity.FgConfig;
import com.koalacute.micro.koala.synthe.entity.FgError;
import com.koalacute.micro.koala.synthe.entity.FgMessage;
import com.koalacute.micro.koala.synthe.enums.notify.FgConfigValidFlagEnum;
import com.koalacute.micro.koala.synthe.enums.notify.FgResponseStatus;
import com.koalacute.micro.koala.synthe.mapper.FgErrorMapper;
import com.koalacute.micro.koala.synthe.mapper.FgMessageMapper;
import com.koalacute.micro.koala.synthe.service.notify.IGameNotifyService;
import com.koalacute.micro.koala.synthe.service.query.FgConfigQueryService;
import com.koalacute.micro.koala.synthe.service.remote.RemoteService;
import com.koalacute.micro.koala.utils.exception.BusinessException;
import com.koalacute.micro.koala.utils.util.DateFormatUtil;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service(value = "fgSendMessageServiceImpl")
public class FgSendMessageService implements IGameNotifyService {

    private static final Logger logger = LoggerFactory.getLogger(FgSendMessageService.class);

    @Autowired
    private RemoteService remoteService;
    @Autowired
    private FgConfigQueryService fgConfigQueryService;
    @Autowired
    private FgMessageMapper fgMessageMapper;
    @Autowired
    private FgErrorMapper fgErrorMapper;

    @Value("${fei.ge.secret}")
    private String secret;

    @Value("${fei.ge.jumpUrl}")
    private String jumpUrl;

    @Value("${fei.ge.app.key}")
    private String appKey;

    @Value("${fei.ge.template.id}")
    private String templateId;

    @Override
    public void gameNotify() throws Exception {
        //impl
        FgSendMessageDto fgSendMessageDto = packageNotifyInfo();
        //post
        FgResponse fgResponse = remoteService.fgSendMessageZs(fgSendMessageDto);
        if (FgResponseStatus.SUCCESS.code == fgResponse.getCode()) {
            saveFgMessage(fgSendMessageDto);
        } else {
            saveFgError(fgResponse);
        }
    }


    /**
     * 保存错误信息
     */
    private void saveFgError(FgResponse fgResponse) {
        FgError fgError = new FgError();
        fgError.setCreatedTime(new Date());
        fgError.setUpdatedTime(new Date());
        fgError.setErrorCode(String.valueOf(fgResponse.getCode()));
        fgError.setErrorDesc(FgResponseStatus.getDescByCode(fgResponse.getCode()));
        fgError.setErrorData(fgResponse.getMsg());
        fgErrorMapper.insertSelective(fgError);
    }


    /**
     * 保存发送记录
     */
    private void saveFgMessage(FgSendMessageDto fgSendMessageDto) {
        FgMessage fgMessage = new FgMessage();
        fgMessage.setCreateTime(new Date());
        fgMessage.setUpdateTime(new Date());
        fgMessage.setSendContent(fgSendMessageDto.getData().toString());
        fgMessageMapper.insertSelective(fgMessage);
    }


    /**
     * 打包通知内容
     *
     * @return
     */
    private FgSendMessageDto packageNotifyInfo() throws Exception {
        FgData fgData = handleData();
        FgSendMessageDto fgSendMessageDto = new FgSendMessageDto();
        fgSendMessageDto.setSecret(secret);
        fgSendMessageDto.setAppKey(appKey);
        fgSendMessageDto.setTemplateId(templateId);
        fgSendMessageDto.setData(fgData);
        fgSendMessageDto.setUrl(jumpUrl);
        return fgSendMessageDto;
    }


    /**
     * 处理需要发送的内容
     *
     * @return
     */
    private FgData handleData() throws Exception {
        FgData fgData = new FgData();
        getFirstAndKeyword1(fgData);
        fgData.getKeyword2().setValue(DateFormatUtil.datetime2String(new Date()));
        fgData.getRemark().setValue("Best Regards");
        return fgData;
    }


    /**
     * 路由通知参数
     *
     * @param fgData
     */
    private void getFirstAndKeyword1(FgData fgData) throws Exception {
        FgConfig fgConfig = null;
        fgConfig = fgConfigQueryService.findFgConfigByHourAndWeekAndValidFlag(DateFormatUtil.getNowHour(),
                String.valueOf(DateFormatUtil.getCurDayOfWeek()), FgConfigValidFlagEnum.VALID.code);
        if (null == fgConfig) {
            List<FgConfig> fgConfigList = fgConfigQueryService.findFgConfigByHourAndValidFlag(DateFormatUtil.getNowHour(), FgConfigValidFlagEnum.VALID.code);
            if (CollectionUtils.isEmpty(fgConfigList) || fgConfigList.size() > 1) {
                logger.error("[路由通知参数] 当前时间未匹配到对应的活动,当前时间:{}", DateFormatUtil.date2timestamp(new Date()));
                throw new BusinessException("当前时间未匹配到对应的活动");
            }
            fgConfig = fgConfigList.get(0);
        }
        fgData.getFirst().setValue(fgConfig.getNtTitle());
        fgData.getKeyword1().setValue(fgConfig.getNtContent());
    }
}
