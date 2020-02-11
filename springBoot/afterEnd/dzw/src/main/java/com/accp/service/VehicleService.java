package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.accp.domain.Carinfo;
import com.accp.domain.Customer;
import com.accp.mapper.CarinfoMapper;
import com.accp.mapper.CustomerMapper;

@Service
@Transactional
public class VehicleService {
	
	@Autowired
	CarinfoMapper carinfoMapper;
	
	@Autowired
	CustomerMapper customerMapper;
	
	//查询所有车资料
	public List<Carinfo> queryCarinfo(){
		return carinfoMapper.queryCarinfo();
	}
	//根据车资料查询客户
	public List<Customer> queryCustomer(String cno) {
		return customerMapper.queryKey(cno);
	}
	//新增车辆信息
	public int insertCarinfo(Carinfo carinfo) {
		return carinfoMapper.insert(carinfo);
	}
	//修改车辆信息
	public int updateCarinfo(Carinfo carinfo) {
		return carinfoMapper.updateByPrimaryKey(carinfo);
	}
	//删除车辆信息
	public int deleteCarinfo(String cdlicense) {
		return carinfoMapper.deleteByPrimaryKey(cdlicense);
	}
	//按驾驶员姓名/简码/手机/车牌号模糊查询
	//按车牌号与车架号多条件查询
}
