package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carbrandinfo;
import com.accp.mapper.CarbrandinfoMapper;

@Service
@Transactional
public class CarbrandinfoService {

	@Autowired
	CarbrandinfoMapper carbrandinfoMapper;
	
	public List<Carbrandinfo> sel(String con){
		return carbrandinfoMapper.select(con);
	}
	
	public int carbrandinfodelet(String cid) {
		return carbrandinfoMapper.deleteByPrimaryKey(cid);
	}
}
