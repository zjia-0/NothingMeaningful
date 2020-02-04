package com.accp.mapper;

import com.accp.domain.Cars;
import com.accp.domain.CarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarsMapper {
    int countByExample(CarsExample example);

    int deleteByExample(CarsExample example);

    int deleteByPrimaryKey(Integer carid);

    int insert(Cars record);

    int insertSelective(Cars record);

    List<Cars> selectByExample(CarsExample example);

    Cars selectByPrimaryKey(Integer carid);

    int updateByExampleSelective(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByExample(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByPrimaryKeySelective(Cars record);

    int updateByPrimaryKey(Cars record);
}