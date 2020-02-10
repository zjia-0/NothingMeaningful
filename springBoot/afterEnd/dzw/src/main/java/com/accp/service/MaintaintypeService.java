package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Maintaintype;
import com.accp.mapper.MaintaintypeMapper;

@Service
@Transactional
public class MaintaintypeService {
	@Autowired
	MaintaintypeMapper maintaintypeMapper;
	
	public List<Maintaintype> maintaintypeselect(){
		return maintaintypeMapper.selectByExample(null);
	}

}
