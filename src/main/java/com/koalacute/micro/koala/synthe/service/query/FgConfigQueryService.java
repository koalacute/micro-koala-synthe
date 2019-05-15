package com.koalacute.micro.koala.synthe.service.query;

import com.koalacute.micro.koala.synthe.entity.FgConfig;
import com.koalacute.micro.koala.synthe.entity.FgConfigExample;
import com.koalacute.micro.koala.synthe.mapper.FgConfigMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FgConfigQueryService {

    @Autowired
    private FgConfigMapper fgConfigMapper;

    /**
     * 查配置
     *
     * @param hour      小时
     * @param week      周天
     * @param validFlag 标记
     * @return
     */
    public FgConfig findFgConfigByHourAndWeekAndValidFlag(String hour, String week, String validFlag) {
        FgConfigExample fgConfigExample = new FgConfigExample();
        fgConfigExample.createCriteria().andNtHourEqualTo(hour).andValidFlagEqualTo(validFlag).andNtWeekEqualTo(week);
        fgConfigExample.setOrderByClause(" id desc limit 1");
        List<FgConfig> fgConfigList = fgConfigMapper.selectByExample(fgConfigExample);
        if (CollectionUtils.isEmpty(fgConfigList)) {
            return null;
        }
        return fgConfigList.get(0);
    }

    /**
     * 查配置
     *
     * @param hour      小时
     * @param validFlag 标记
     * @return
     */
    public List<FgConfig> findFgConfigByHourAndValidFlag(String hour, String validFlag) {
        FgConfigExample fgConfigExample = new FgConfigExample();
        fgConfigExample.createCriteria().andNtHourEqualTo(hour).andValidFlagEqualTo(validFlag);
        return fgConfigMapper.selectByExample(fgConfigExample);
    }
}
