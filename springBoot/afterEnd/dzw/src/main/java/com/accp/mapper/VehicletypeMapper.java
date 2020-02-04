package com.accp.mapper;

import com.accp.domain.Vehicletype;
import com.accp.domain.VehicletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicletypeMapper {
    int countByExample(VehicletypeExample example);

    int deleteByExample(VehicletypeExample example);

    int deleteByPrimaryKey(String typeid);

    int insert(Vehicletype record);

    int insertSelective(Vehicletype record);

    List<Vehicletype> selectByExample(VehicletypeExample example);

    Vehicletype selectByPrimaryKey(String typeid);

    int updateByExampleSelective(@Param("record") Vehicletype record, @Param("example") VehicletypeExample example);

    int updateByExample(@Param("record") Vehicletype record, @Param("example") VehicletypeExample example);

    int updateByPrimaryKeySelective(Vehicletype record);

    int updateByPrimaryKey(Vehicletype record);
}