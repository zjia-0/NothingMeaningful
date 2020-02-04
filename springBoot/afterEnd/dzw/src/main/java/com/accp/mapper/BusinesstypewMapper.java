package com.accp.mapper;

import com.accp.domain.Businesstypew;
import com.accp.domain.BusinesstypewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinesstypewMapper {
    int countByExample(BusinesstypewExample example);

    int deleteByExample(BusinesstypewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Businesstypew record);

    int insertSelective(Businesstypew record);

    List<Businesstypew> selectByExample(BusinesstypewExample example);

    Businesstypew selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Businesstypew record, @Param("example") BusinesstypewExample example);

    int updateByExample(@Param("record") Businesstypew record, @Param("example") BusinesstypewExample example);

    int updateByPrimaryKeySelective(Businesstypew record);

    int updateByPrimaryKey(Businesstypew record);
}