package com.koalacute.micro.koala.synthe.mapper;

import com.koalacute.micro.koala.synthe.entity.FgMessage;
import com.koalacute.micro.koala.synthe.entity.FgMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FgMessageMapper {
    long countByExample(FgMessageExample example);

    int deleteByExample(FgMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FgMessage record);

    int insertSelective(FgMessage record);

    List<FgMessage> selectByExample(FgMessageExample example);

    FgMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FgMessage record, @Param("example") FgMessageExample example);

    int updateByExample(@Param("record") FgMessage record, @Param("example") FgMessageExample example);

    int updateByPrimaryKeySelective(FgMessage record);

    int updateByPrimaryKey(FgMessage record);
}