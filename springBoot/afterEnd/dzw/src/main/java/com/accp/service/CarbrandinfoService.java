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
	
	public List<Carbrandinfo> sel(String cno,String cxbh){
		if (cxbh==null||cxbh=="") {
			return carbrandinfoMapper.select(cno);
		}
		return carbrandinfoMapper.selectr(cno, cxbh, cxbh);
	}
	
	public int carbrandinfodelet(String cid) {
		return carbrandinfoMapper.deleteByPrimaryKey(cid);
	}
	
	public int carbrandinfoinsert(Carbrandinfo carbrandinfo) {
		return carbrandinfoMapper.insert(carbrandinfo);
	}
	
	public int carbrandinfoupdate(Carbrandinfo carbrandinfo) {
		return carbrandinfoMapper.updateByPrimaryKey(carbrandinfo);
	}
	
	public Carbrandinfo selrs(String cid) {
		return carbrandinfoMapper.selectByPrimaryKey(cid);
	}
}
