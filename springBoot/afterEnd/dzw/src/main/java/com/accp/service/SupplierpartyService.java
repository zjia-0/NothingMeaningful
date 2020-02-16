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
	
	public List<Vendor> vensel(){
		return supplierpartyMapper.vensel();
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
