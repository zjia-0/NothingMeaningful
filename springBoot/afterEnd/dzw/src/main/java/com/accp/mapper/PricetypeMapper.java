package com.accp.mapper;

import com.accp.domain.Pricetype;
import com.accp.domain.PricetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PricetypeMapper {
    int countByExample(PricetypeExample example);

    int deleteByExample(PricetypeExample example);

    int deleteByPrimaryKey(Integer ptid);

    int insert(Pricetype record);

    int insertSelective(Pricetype record);

    List<Pricetype> selectByExample(PricetypeExample example);

    Pricetype selectByPrimaryKey(Integer ptid);

    int updateByExampleSelective(@Param("record") Pricetype record, @Param("example") PricetypeExample example);

    int updateByExample(@Param("record") Pricetype record, @Param("example") PricetypeExample example);

    int updateByPrimaryKeySelective(Pricetype record);

    int updateByPrimaryKey(Pricetype record);
}