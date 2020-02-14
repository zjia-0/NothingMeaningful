package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Artisanstars;
import com.accp.domain.Banzu;
import com.accp.domain.Cars;
import com.accp.domain.wqcl;
import com.accp.mapper.BanzuMapper;
import com.accp.mapper.CarsMapper;

@Service
@Transactional
public class CarsService {// 外勤车辆

	@Autowired
	CarsMapper cmapper;
	
	@Autowired
	BanzuMapper bmapp;

	// 主页查询
	public List<Cars> select() {
		return cmapper.selectByExample(null);
	}

	//根据点击进行单个查询
	public wqcl selectid(String carid) {
		return cmapper.selectid(carid);
	}
		
	//修改
	public int ArtisanstarsUpdate(Cars art) {
		return cmapper.updateByPrimaryKey(art);
	}
		
	//新增
	public int ArtisanstarsAdd(Cars art) {
		return cmapper.insert(art);
	}
		
	//删除
	public int ArtisanstarsRemove(int starleveid) {
		return cmapper.deleteByPrimaryKey(starleveid);
	}
	
	//查询班组
	public Banzu selectbz(String id) {
		return bmapp.selectByPrimaryKey(id);
	}
}
