package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Supplierparty;
import com.accp.domain.Vendor;
import com.accp.mapper.SupplierpartyMapper;

@Service
@Transactional
public class SupplierpartyService {
	@Autowired
	SupplierpartyMapper supplierpartyMapper;
	
	public List<Supplierparty> supplierpartysel(){
		return supplierpartyMapper.selectByExample(null);
	}
	
	public List<Vendor> vensel(String supcode,String supname,String address,String way,String grade,String brand,String unitsname,String contacts,
							   String phone,String mobile,String scase,String remark,String chazhi){
		System.out.println(unitsname);
		System.out.println(chazhi);
		System.out.println(supcode);
		if (unitsname==""||unitsname==null &&chazhi.equals("")||chazhi.equals(null) &&contacts.equals("")||contacts.equals(null) && mobile.equals("")||mobile.equals(null)&&supcode.equals("")||supcode.equals(null)) {
			return supplierpartyMapper.vensel();
		}else if (chazhi==""||chazhi==null&&unitsname!=""||unitsname!=null) {
			return supplierpartyMapper.venselshux(unitsname);
		}else if (supcode==null||supcode==""&&unitsname==""||unitsname==null&&chazhi!=""||chazhi!=null) {
			return supplierpartyMapper.venselxia(chazhi, chazhi);
		}
		return supplierpartyMapper.venselbiao(supcode, supname, address, way, grade, brand, unitsname, contacts, phone, mobile, scase, remark);
	}
	
	public int supplierpartyinsert(Supplierparty supplierparty) {
		return supplierpartyMapper.insert(supplierparty);
	}
	
	public int supplierpartydelete(int supid) {
		return supplierpartyMapper.deleteByPrimaryKey(supid);
	}
	
	public Supplierparty supplierpartyupdatesel(int supid) {
		return supplierpartyMapper.selectByPrimaryKey(supid);
	}
	
	public int  supplierpartyupdate(Supplierparty supplierparty) {
		return supplierpartyMapper.updateByPrimaryKey(supplierparty);
	}
	
	
}
