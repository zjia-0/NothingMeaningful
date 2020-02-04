package com.accp.mapper;

import com.accp.domain.Fuel;
import com.accp.domain.FuelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FuelMapper {
    int countByExample(FuelExample example);

    int deleteByExample(FuelExample example);

    int deleteByPrimaryKey(Integer fuelid);

    int insert(Fuel record);

    int insertSelective(Fuel record);

    List<Fuel> selectByExample(FuelExample example);

    Fuel selectByPrimaryKey(Integer fuelid);

    int updateByExampleSelective(@Param("record") Fuel record, @Param("example") FuelExample example);

    int updateByExample(@Param("record") Fuel record, @Param("example") FuelExample example);

    int updateByPrimaryKeySelective(Fuel record);

    int updateByPrimaryKey(Fuel record);
}