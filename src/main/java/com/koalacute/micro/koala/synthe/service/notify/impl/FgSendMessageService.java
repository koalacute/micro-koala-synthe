package com.koalacute.micro.koala.synthe.service.notify.impl;

import com.koalacute.micro.koala.synthe.dto.FgSendMessageDto;
import com.koalacute.micro.koala.synthe.dto.notify.fg.FgData;
import com.koalacute.micro.koala.synthe.dto.response.FgResponse;
import com.koalacute.micro.koala.synthe.entity.FgError;
import com.koalacute.micro.koala.synthe.entity.FgMessage;
import com.koalacute.micro.koala.synthe.enums.notify.FgResponseStatus;
import com.koalacute.micro.koala.synthe.mapper.FgErrorMapper;
import com.koalacute.micro.koala.synthe.mapper.FgMessageMapper;
import com.koalacute.micro.koala.synthe.service.notify.IGameNotifyService;
import com.koalacute.micro.koala.synthe.service.remote.RemoteService;
import com.koalacute.microkoala.utils.util.DateFormatUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service(value = "fgSendMessageServiceImpl")
public class FgSendMessageService implements IGameNotifyService {

    private static final Logger logger = LoggerFactory.getLogger(FgSendMessageService.class);

    @Autowired
    private RemoteService remoteService;
    @Autowired
    private FgMessageMapper fgMessageMapper;
    @Autowired
    private FgErrorMapper fgErrorMapper;

    @Value("${fei.ge.secret}")
    private String secret;

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
    private FgSendMessageDto packageNotifyInfo() {
        FgData fgData = handleData();
        FgSendMessageDto fgSendMessageDto = new FgSendMessageDto();
        fgSendMessageDto.setSecret(secret);
        fgSendMessageDto.setAppKey(appKey);
        fgSendMessageDto.setTemplateId(templateId);
        fgSendMessageDto.setData(fgData);
        fgSendMessageDto.setUrl("https://bbs.houdao.com/");
        return fgSendMessageDto;
    }


    /**
     * 处理需要发送的内容
     *
     * @return
     */
    private FgData handleData() {
        FgData fgData = new FgData();
        fgData.getFirst().setValue("灵犀双修提醒");
        fgData.getKeyword1().setValue("灵犀双修活动即将开始,请上线哈");
        fgData.getKeyword2().setValue(DateFormatUtil.dateToString(DateFormatUtil.getNow(), DateFormatUtil.YYYY_MM_DD) + " 11:30:00");
        fgData.getRemark().setValue("Best Regards");
        return fgData;
    }
}
