package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Department;
import com.accp.domain.Personnel;
import com.accp.domain.Store;
import com.accp.domain.txml;
import com.accp.service.ZzjgService;

@RestController
public class ZzjgController {

	@Autowired
	ZzjgService zser;
	
	//查询门店
	@RequestMapping("/selectmendian")
	public List<Store> selectmendian(){
		return zser.selectmendian();
	}
	
	//根据门店id查询部门
	 @RequestMapping("/selectbumen")
	 public List<Department> selectbumen(String storeid){ 
		 return zser.selectbumen(storeid);
	 }
	 
	 
	//查询员工
	 @RequestMapping("/chaxunyuangong")
	public List<txml> chaxun(String storeid,String departid){
			return zser.chaxun(storeid, departid);
	}
	
	//新增员工查询
	@RequestMapping("/selectadd")
	public txml selectadd(String departid) {
			return zser.selectadd(departid);
	}
	
	//查询员工个数
	@RequestMapping("/count")
	public int selectCount() {
			return zser.selectCount();
	}
	
	
	//新增员工
	@RequestMapping("/addyg")
	public int addyg(Personnel per,String staffid) {
			return zser.addyg(per, staffid);
	}
	
	//修改模态框赋值
	@RequestMapping("/selectupdate")
	public txml selectupdate(int personnelid) {
		return zser.selectupdate(personnelid);
	}
	
	//修改员工
	@RequestMapping("/updateyg")
	public int updateyg(Personnel per) {
		return zser.updateyg(per);
	}
	
	//删除员工\
	@RequestMapping("/remove")
	public int removeyg(String  personnelid) {
		return zser.removeyg(personnelid);
	}
	
	//新增同级 查询门店
	@RequestMapping("/xzbumenselect")
	public txml xzbumneselect(String departid) {
		return zser.xzbumneselect(departid);
	}
	
	//新增同级
	@RequestMapping("/xztj1")
	public int addtj(Department record) {
		return zser.addtj(record);
	}
	
	//修改部门
	@RequestMapping("/updatebms")
	public int updatebm(Department record) {
		return zser.updatebm(record);
	}
	
	//删除部门
	@RequestMapping("/bmsc")
	public int removebm(String departid) {
		System.out.println(departid+"123");
		return zser.removebm(departid);
	}
}
