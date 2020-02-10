package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Distinction;
import com.accp.mapper.DistinctionMapper;

@Service
@Transactional
public class DistinctionService {
	@Autowired
	DistinctionMapper distinctionMapper;
	
	public List<Distinction> sel(){
		return distinctionMapper.selectByExample(null);
	}
	
	public int distinctionupdate(Distinction distinction) {
		return distinctionMapper.updateByPrimaryKey(distinction);
	}
}
