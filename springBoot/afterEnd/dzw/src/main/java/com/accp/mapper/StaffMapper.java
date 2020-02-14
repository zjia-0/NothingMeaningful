package com.accp.mapper;

import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
	int updatejs(@Param("staffid") String staffid, @Param("roleid") String roleid);
	
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);
}