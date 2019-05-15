package com.koalacute.micro.koala.synthe.mapper;

import com.koalacute.micro.koala.synthe.entity.FgConfig;
import com.koalacute.micro.koala.synthe.entity.FgConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FgConfigMapper {
    long countByExample(FgConfigExample example);

    int deleteByExample(FgConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FgConfig record);

    int insertSelective(FgConfig record);

    List<FgConfig> selectByExample(FgConfigExample example);

    FgConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FgConfig record, @Param("example") FgConfigExample example);

    int updateByExample(@Param("record") FgConfig record, @Param("example") FgConfigExample example);

    int updateByPrimaryKeySelective(FgConfig record);

    int updateByPrimaryKey(FgConfig record);
}