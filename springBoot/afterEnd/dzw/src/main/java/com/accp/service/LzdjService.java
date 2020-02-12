package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Dimission;
import com.accp.domain.Store;
import com.accp.domain.lldj;
import com.accp.domain.txml;
import com.accp.mapper.DimissionMapper;
import com.accp.mapper.PersonnelMapper;
import com.accp.mapper.StoreMapper;

@Service
@Transactional
public class LzdjService {
//离职登记
	
	@Autowired
	DimissionMapper dmapper;
	
	@Autowired 
	PersonnelMapper pmap;
	
	@Autowired 
	StoreMapper smapp;
	
	//离职登记查询
	public List<lldj> lzdjselect(){
		return dmapper.lldjselect();
	}
	
	//员工查询
	public List<txml> yuangong(int personnelid){
		return pmap.lzdjselectid(personnelid);
	}
	
	//门店下拉框
	public List<Store> mendian(){
		return smapp.selectByExample(null);
	}
	
	//新增离职人员
	public int lizhi(String staffid,String dimissiondates,String causes ) {
		txml t=pmap.lizhi(staffid);
		Dimission dim=new Dimission( t.getDepartid(), t.getStaffid(), t.getPersonnelname(), t.getSex(), t.getPost(), dimissiondates,causes,"0");
		return dmapper.insert(dim);
	}
	
	//离职人员回滚
	public int huigun(Dimission record ) {
		return dmapper.updateByPrimaryKeySelective(record);
	}
	
	//删除
	public int remove(int id ) {
		return dmapper.deleteByPrimaryKey(id);
	}
}
