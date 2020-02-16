package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Price;
import com.accp.mapper.PriceMapper;

@Service
@Transactional
public class PriceService {
	@Autowired
	PriceMapper priceMapper;
	
	public List<Price> pricesel(){
		return priceMapper.selectByExample(null);
	}
}
