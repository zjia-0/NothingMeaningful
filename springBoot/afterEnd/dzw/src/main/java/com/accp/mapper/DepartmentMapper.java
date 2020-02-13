package com.accp.mapper;

import com.accp.domain.Department;
import com.accp.domain.DepartmentExample;
import com.accp.domain.txml;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
	txml xzbumen(String departid);
	
	txml selectupdate(Integer personnelid);
	
	txml add(String departid);
	
	List<txml> chaxun(@Param("departid") String departid, @Param("storeid") String storeid);
	
	 List<Department> selectids(String storeid); 
	 
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(String departid);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(String departid);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}