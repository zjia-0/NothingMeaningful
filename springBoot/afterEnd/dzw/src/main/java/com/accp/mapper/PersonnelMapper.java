package com.accp.mapper;

import com.accp.domain.Personnel;
import com.accp.domain.PersonnelExample;
import com.accp.domain.txml;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelMapper {
	txml lzdjdakai(int personnelid );
	
	txml lizhi(String staffid);
	
	List<txml> lzdjselectid(int storeid);
	
	txml txmlselectid( int personnelid);
	
	List<txml> txmlselect();
	
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