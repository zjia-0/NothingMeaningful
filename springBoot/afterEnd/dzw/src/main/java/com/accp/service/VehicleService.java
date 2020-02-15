package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.accp.domain.Carbelong;
import com.accp.domain.Carinfo;
import com.accp.domain.Customer;
import com.accp.domain.Engine;
import com.accp.domain.Fuel;
import com.accp.domain.Insurance;
import com.accp.mapper.CarbelongMapper;
import com.accp.mapper.CarinfoMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.EngineMapper;
import com.accp.mapper.FuelMapper;
import com.accp.mapper.InsuranceMapper;
/**
 * 车资料
 * @author ASUS
 *
 */
@Service
@Transactional
public class VehicleService {
	
	@Autowired
	CarinfoMapper carinfoMapper;	
	@Autowired
	CustomerMapper customerMapper;
	@Autowired
	CarbelongMapper carbelongMapper;
	@Autowired
	EngineMapper engineMapper;
	@Autowired
	FuelMapper fuelMapper;
	@Autowired
	InsuranceMapper insuranceMapper;
	
	//查询所有车资料
	public List<Carinfo> queryCarinfo(){
		return carinfoMapper.queryCarinfo();
	}
	//模糊查询
	public List<Carinfo> queryLike(String mohu,String chepai,String chejia){
		return carinfoMapper.queryCarinfoLike(mohu, chepai, chejia);
	}
	//新增绑定下拉框
	public List<Carbelong> bindCarbelong(){
		return carbelongMapper.selectByExample(null);
	}
	public List<Engine> bindEngine(){
		return engineMapper.selectByExample(null);
	}
	public List<Fuel> bindFuel(){
		return fuelMapper.selectByExample(null);
	}
	public List<Insurance> bindInsurance(){
		return insuranceMapper.selectByExample(null);
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
