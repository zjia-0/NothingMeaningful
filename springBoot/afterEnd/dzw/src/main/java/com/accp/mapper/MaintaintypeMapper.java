package com.accp.mapper;

import com.accp.domain.Maintaintype;
import com.accp.domain.MaintaintypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintaintypeMapper {
	
	List<Maintaintype> selectByparentid(Integer parentid);
	
    int countByExample(MaintaintypeExample example);

    int deleteByExample(MaintaintypeExample example);

    int deleteByPrimaryKey(Integer maintainid);

    int insert(Maintaintype record);

    int insertSelective(Maintaintype record);

    List<Maintaintype> selectByExample(MaintaintypeExample example);

    Maintaintype selectByPrimaryKey(Integer maintainid);

    int updateByExampleSelective(@Param("record") Maintaintype record, @Param("example") MaintaintypeExample example);

    int updateByExample(@Param("record") Maintaintype record, @Param("example") MaintaintypeExample example);

    int updateByPrimaryKeySelective(Maintaintype record);

    int updateByPrimaryKey(Maintaintype record);
}