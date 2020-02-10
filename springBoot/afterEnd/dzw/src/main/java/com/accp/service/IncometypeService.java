package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Incometype;
import com.accp.mapper.IncometypeMapper;

@Service
@Transactional
public class IncometypeService {
	@Autowired
	IncometypeMapper incometypeMapper;
	public List<Incometype> incometypeselect(){
		return incometypeMapper.selectByExample(null);
	}

}
