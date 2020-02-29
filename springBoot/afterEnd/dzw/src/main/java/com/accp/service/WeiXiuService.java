package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Bills;
import com.accp.mapper.BillsMapper;

//维修模块
@Service
@Transactional
public class WeiXiuService {
	
	@Autowired
	BillsMapper billsMapper;
	
	//查询所有作业中车辆
	public List<Bills> queryCars(){
		return billsMapper.queryWeiXiu();
	}
	
	//查询维修历史
	public List<Bills> weixiuHistory(String cdlicense){
		return billsMapper.weixiuHistory(cdlicense);
	}
	
	//查询维修项目
	public List<Bills> queryProject(String cdlicense){
		return billsMapper.queryProject(cdlicense);
	}
	
	//查询领料情况
	public List<Bills> queryLinliao(String cdlicense){
		return billsMapper.queryLinliao(cdlicense);
	}
}
