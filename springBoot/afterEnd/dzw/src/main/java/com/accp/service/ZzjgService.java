package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Department;
import com.accp.domain.Personnel;
import com.accp.domain.Roles;
import com.accp.domain.Staff;
import com.accp.domain.Store;
import com.accp.domain.txml;
import com.accp.mapper.DepartmentMapper;
import com.accp.mapper.PersonnelMapper;
import com.accp.mapper.RolesMapper;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.StoreMapper;

@Service
@Transactional
public class ZzjgService {

	@Autowired
	StoreMapper smapp;

	@Autowired
	DepartmentMapper dmapp;
	
	@Autowired
	PersonnelMapper pmapp;
	
	@Autowired
	StaffMapper stamapp;
	
	@Autowired
	RolesMapper rmapp;

	// 查询门店
	public List<Store> selectmendian() {
		return smapp.selectByExample(null);
	}


	 //根据门店id查询部门
	public List<Department> selectbumen(String storeid){ 
		
		return dmapp.selectids(storeid); 
	 }
	
	
	//查询员工
	public List<txml> chaxun(String storeid,String departid){
		
		return dmapp.chaxun(departid, storeid);
	}
	
	//新增员工查询
	public txml selectadd(String departid) {
		return dmapp.add(departid);
	}
	
	//新增员工个数
	public int selectCount() {
		return pmapp.countByExample(null);
	}
	
	
	//新增员工
	public int addyg(Personnel per,String staffid) {
		int a=pmapp.insertSelective(per);
		 Staff sta=new Staff(staffid, per.getPersonnelid());
		 int b=stamapp.insert(sta);
		 return a;
	}
	
	//修改模态框赋值
	public txml selectupdate(Integer personnelid) {
		System.out.println(personnelid+"56");
		return dmapp.selectupdate(personnelid);
	}
	
	//修改员工
	public int updateyg(Personnel per) {
		return pmapp.updateByPrimaryKeySelective(per);
	}
	
	//删除员工
	public int removeyg(String  personnelid) {
		return pmapp.deleteByPrimaryKey(personnelid);
	}
	
	//新增同级 查询门店
	public txml xzbumneselect(String departid) {
		return dmapp.xzbumen(departid);
	}
	
	//新增同级
	public int addtj(Department record) {
		return dmapp.insertSelective(record);
	}
	
	//修改部门
	public int updatebm(Department record) {
		return dmapp.updateByPrimaryKeySelective(record);
	}
	
	//删除部门
	public int removebm(String departid) {
		return dmapp.deleteByPrimaryKey(departid);
	}
	
	//查询角色
	public List<Roles> js(){
		return rmapp.selectByExample(null);
	}
	
	//修改员工编号表
	public int updatejs(String staffid,String roleid) {
		return stamapp.updatejs(staffid, roleid);
	}
}
