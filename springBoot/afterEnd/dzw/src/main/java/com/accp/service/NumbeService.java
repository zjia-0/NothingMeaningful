package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Numbe;
import com.accp.mapper.NumbeMapper;

@Service
@Transactional
public class NumbeService {
	@Autowired
	NumbeMapper numbeMapper;
	
	public List<Numbe> numsel(){
		return numbeMapper.selectByExample(null);
	}
}
