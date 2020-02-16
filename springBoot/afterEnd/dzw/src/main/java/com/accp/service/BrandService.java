package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Brand;
import com.accp.mapper.BrandMapper;

@Service
@Transactional
public class BrandService {
	@Autowired
	BrandMapper brandMapper;
	
	public List<Brand> brandsel(){
		return brandMapper.selectByExample(null);
	}
}
