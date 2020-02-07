package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Engine;
import com.accp.mapper.EngineMapper;

@Service
@Transactional
public class EngineService {
	@Autowired
	EngineMapper engineMapper;
	
	public List<Engine> en(){	
		return engineMapper.selectByExample(null);
	}
	
	public int end(int motorid) {
		int shi=engineMapper.deleteByPrimaryKey(motorid);
		return shi;
	}
	
	public int eni(Engine engine) {
		int zhi= engineMapper.insert(engine);
		return zhi;
	}
	
	public int enu(Engine engine) {
		int shi=engineMapper.updateByPrimaryKey(engine);
		return shi;
	}
}








