package com.accp.mapper;

import com.accp.domain.Units;
import com.accp.domain.UnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitsMapper {
    int countByExample(UnitsExample example);

    int deleteByExample(UnitsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Units record);

    int insertSelective(Units record);

    List<Units> selectByExample(UnitsExample example);

    Units selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Units record, @Param("example") UnitsExample example);

    int updateByExample(@Param("record") Units record, @Param("example") UnitsExample example);

    int updateByPrimaryKeySelective(Units record);

    int updateByPrimaryKey(Units record);
}