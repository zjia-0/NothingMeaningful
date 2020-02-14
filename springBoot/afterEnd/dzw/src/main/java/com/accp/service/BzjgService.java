package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Banzu;
import com.accp.domain.bzjg;
import com.accp.mapper.BanzuMapper;
import com.accp.mapper.WorkmanMapper;

@Service
@Transactional
public class BzjgService {

	@Autowired
	BanzuMapper bmapp;
	
	@Autowired
	WorkmanMapper wmapp;
	
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
}
