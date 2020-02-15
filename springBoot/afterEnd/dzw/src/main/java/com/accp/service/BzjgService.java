package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Banzu;
import com.accp.domain.Personnel;
import com.accp.domain.Staff;
import com.accp.domain.Workman;
import com.accp.domain.bzjg;
import com.accp.mapper.BanzuMapper;
import com.accp.mapper.PersonnelMapper;
import com.accp.mapper.WorkmanMapper;

@Service
@Transactional
public class BzjgService {

	@Autowired
	BanzuMapper bmapp;
	
	@Autowired
	WorkmanMapper wmapp;
	
	@Autowired
	PersonnelMapper pmapp;
	
	//查询班组树状图
	public List<Banzu> chaxunszt(){
		return bmapp.mulu();
	}
	
	//根据班组查询小组
	public List<Banzu> chabanzu(String banzuid){
		return bmapp.chabanzu(banzuid);
	}
	
	//查询技工
	public List<bzjg> bzgjselect(String remark2,String banzuid){
		return wmapp.bzjgselect(remark2,banzuid);
	}
	
	//新增员工
	public int addjg(Personnel per,String workid,String stars,String craft,String brand,String remark1,String remark2) {
		int a=pmapp.insertSelective(per);
		Workman wo=new Workman(workid, stars, craft, brand, per.getPersonnelid(), remark1, remark2);
		 int b=wmapp.insertSelective(wo);
		 return a;
	}
	
	//新增模态框查询班组id
	public Banzu addbanzuid(String id) {
		return bmapp.selectByPrimaryKey(id);
	}
	
	//根据id查询技工修改
	public bzjg jgxiugai(String workid) {
		return wmapp.jgxiugai(workid);
	}
	
	//修改员工
	public int updatejg(Personnel per,String workid,String stars,String craft,String brand,String remark1,String remark2) {
		int a=pmapp.updateByPrimaryKeySelective(per);
		Workman wo=new Workman(workid, stars, craft, brand, per.getPersonnelid(), remark1, remark2);
		 int b=wmapp.updateByPrimaryKeySelective(wo);
		 return a;
	}
}
