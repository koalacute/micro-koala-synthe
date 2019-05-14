package com.koalacute.micro.koala.synthe.mapper;

import com.koalacute.micro.koala.synthe.entity.FgError;
import com.koalacute.micro.koala.synthe.entity.FgErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FgErrorMapper {
    long countByExample(FgErrorExample example);

    int deleteByExample(FgErrorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FgError record);

    int insertSelective(FgError record);

    List<FgError> selectByExample(FgErrorExample example);

    FgError selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FgError record, @Param("example") FgErrorExample example);

    int updateByExample(@Param("record") FgError record, @Param("example") FgErrorExample example);

    int updateByPrimaryKeySelective(FgError record);

    int updateByPrimaryKey(FgError record);
}