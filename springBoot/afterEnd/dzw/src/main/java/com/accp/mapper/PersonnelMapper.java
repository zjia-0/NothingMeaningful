package com.accp.mapper;

import com.accp.domain.Personnel;
import com.accp.domain.PersonnelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelMapper {
    int countByExample(PersonnelExample example);

    int deleteByExample(PersonnelExample example);

    int deleteByPrimaryKey(String personnelid);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    List<Personnel> selectByExample(PersonnelExample example);

    Personnel selectByPrimaryKey(String personnelid);

    int updateByExampleSelective(@Param("record") Personnel record, @Param("example") PersonnelExample example);

    int updateByExample(@Param("record") Personnel record, @Param("example") PersonnelExample example);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);
}