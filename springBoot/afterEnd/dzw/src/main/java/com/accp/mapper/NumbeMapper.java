package com.accp.mapper;

import com.accp.domain.Numbe;
import com.accp.domain.NumbeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NumbeMapper {
    int countByExample(NumbeExample example);

    int deleteByExample(NumbeExample example);

    int deleteByPrimaryKey(String numbeid);

    int insert(Numbe record);

    int insertSelective(Numbe record);

    List<Numbe> selectByExample(NumbeExample example);

    Numbe selectByPrimaryKey(String numbeid);

    int updateByExampleSelective(@Param("record") Numbe record, @Param("example") NumbeExample example);

    int updateByExample(@Param("record") Numbe record, @Param("example") NumbeExample example);

    int updateByPrimaryKeySelective(Numbe record);

    int updateByPrimaryKey(Numbe record);
}