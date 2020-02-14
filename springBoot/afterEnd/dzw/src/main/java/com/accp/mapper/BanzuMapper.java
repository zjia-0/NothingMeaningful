package com.accp.mapper;

import com.accp.domain.Banzu;
import com.accp.domain.BanzuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanzuMapper {
	List<Banzu> mulu();
	
	List<Banzu> chabanzu(String banzuid);
	
    int countByExample(BanzuExample example);

    int deleteByExample(BanzuExample example);

    int deleteByPrimaryKey(String id);

    int insert(Banzu record);

    int insertSelective(Banzu record);

    List<Banzu> selectByExample(BanzuExample example);

    Banzu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Banzu record, @Param("example") BanzuExample example);

    int updateByExample(@Param("record") Banzu record, @Param("example") BanzuExample example);

    int updateByPrimaryKeySelective(Banzu record);

    int updateByPrimaryKey(Banzu record);
}