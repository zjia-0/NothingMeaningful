package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Customer;
import com.accp.domain.Vip;
import com.accp.domain.Viplevel;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.VipMapper;
import com.accp.mapper.ViplevelMapper;

@Service
@Transactional
public class VipCenterService {

	@Autowired
	VipMapper vMapper;
	@Autowired
	ViplevelMapper levelMapper;
	@Autowired
	CustomerMapper custMapper;
	
	public List<Vip> findVipByname(String name){
		return vMapper.findVipByname(name);
	}
	/**
	 * 查询所有会员等级类型
	 */
	public List<Viplevel> findVipType(){
		return levelMapper.selectByExample(null);
	}
	/**
	 * 查询最新的用户编号
	 */
	public int findMaxCno() {
		String cno=vMapper.findMaxCno().get(0).getCno();
		return Integer.parseInt(cno);
	}
	/**
	 * 根据会员类型id查询对应初始积分
	 */
	public int queryStartJifen(int levelid) {
		return vMapper.findstarjifen(levelid);
	}
	/**
	 * 会员新增用户
	 * @param cust
	 * @return
	 */
	public int addCustomer(Customer cust) {
		return custMapper.insert(cust);
	}
	/**
	 * 
	 */
	public int addVip(Vip vip) {
		return vMapper.insert(vip); 
	}
	
}
