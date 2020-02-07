package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carbrand;
import com.accp.mapper.CarbrandMapper;

@Service
@Transactional
public class CarbrandService {
	@Autowired
	CarbrandMapper carbrandMapper;
	
	public List<Carbrand> car(){
		return carbrandMapper.selectByExample(null);
	}
	
	public int cari(Carbrand carbrand) {
		System.out.println(carbrand.getBrandname());
		int xin=carbrandMapper.insert(carbrand);
		return xin;
	}
	
	public Carbrand carus(int brandid) {
		return carbrandMapper.selectByPrimaryKey(brandid);
	}
	
	public int caru(Carbrand carbrand) {
		return carbrandMapper.updateByPrimaryKey(carbrand);
	}
	
	public int card(int brandid) {
		return carbrandMapper.deleteByPrimaryKey(brandid);
	}
	
	public Carbrand selr(int cno) {
		return carbrandMapper.selectByPrimaryKey(cno);
	}
	
}
