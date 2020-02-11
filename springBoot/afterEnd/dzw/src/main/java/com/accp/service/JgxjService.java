package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Artisanstars;
import com.accp.mapper.ArtisanstarsMapper;

@Service
@Transactional
public class JgxjService {//j技工星级

	@Autowired
	ArtisanstarsMapper aMapper;
	
	//主页查询
	public List<Artisanstars> select(){
		return aMapper.selectByExample(null);
	}
	
	//根据点击进行单个查询
	public Artisanstars selectid(int starleveid) {
		return aMapper.selectByPrimaryKey(starleveid);
	}
	
	//修改
	public int ArtisanstarsUpdate(Artisanstars art) {
		return aMapper.updateByPrimaryKey(art);
	}
	
	//新增
	public int ArtisanstarsAdd(Artisanstars art) {
		return aMapper.insert(art);
	}
	
	//删除
	public int ArtisanstarsRemove(int starleveid) {
		return aMapper.deleteByPrimaryKey(starleveid);
	}
	
}
