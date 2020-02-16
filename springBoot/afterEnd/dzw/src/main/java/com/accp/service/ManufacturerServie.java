package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Manufacturer;
import com.accp.mapper.ManufacturerMapper;

@Service
@Transactional
public class ManufacturerServie {
	@Autowired
	ManufacturerMapper manufacturerMapper;
	
	public List<Manufacturer> manufacturersel(){
		return manufacturerMapper.selectByExample(null);
	}
	
}
