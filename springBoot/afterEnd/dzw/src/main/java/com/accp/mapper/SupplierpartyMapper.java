package com.accp.mapper;

import com.accp.domain.Supplierparty;
import com.accp.domain.SupplierpartyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierpartyMapper {
    int countByExample(SupplierpartyExample example);

    int deleteByExample(SupplierpartyExample example);

    int deleteByPrimaryKey(Integer supid);

    int insert(Supplierparty record);

    int insertSelective(Supplierparty record);

    List<Supplierparty> selectByExample(SupplierpartyExample example);

    Supplierparty selectByPrimaryKey(Integer supid);

    int updateByExampleSelective(@Param("record") Supplierparty record, @Param("example") SupplierpartyExample example);

    int updateByExample(@Param("record") Supplierparty record, @Param("example") SupplierpartyExample example);

    int updateByPrimaryKeySelective(Supplierparty record);

    int updateByPrimaryKey(Supplierparty record);
}