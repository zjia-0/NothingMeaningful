package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Supplier;
import com.accp.mapper.SupplierMapper;


@RestController
public class SupplierController {
	@Autowired
	SupplierMapper  supplierMapper;
	
	@ResponseBody
	@RequestMapping("/selectSupplierMapperwangmali")
	public List<Supplier> selectSupplierMapperwangmali(){
		return supplierMapper.selectByparentid(0);
	}
	
}
