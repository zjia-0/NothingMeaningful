package com.accp.mapper;

import com.accp.domain.Supplierparty;
import com.accp.domain.SupplierpartyExample;
import com.accp.domain.Vendor;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierpartyMapper {
	List<Vendor> vensel();
	
	List<Vendor> venselshux(String sid);

	List<Vendor> venselxia(String contacts,String mobile);
	
	List<Vendor> venselbiao(String supcode,String supname,String address,String way,String grade,String brand,String unitsname,String contacts,String phone,String mobile,String scase,String remark);
	
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