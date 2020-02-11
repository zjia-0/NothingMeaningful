package com.accp.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Permissions;
import com.accp.domain.Roles;
import com.accp.domain.RolesPerms;
import com.accp.service.JurisdictionServie;

@RestController
@RequestMapping("/per")
public class JurisdictionController {

	@Autowired
	JurisdictionServie JService;
	
	@GetMapping("/per")
	public List<Permissions> queryAlls(){
		return JService.queryAlls();
	}
	@GetMapping("/findRoles")
	public List<Roles> queryRoles(){
		return JService.queryRoles();
	}
	@GetMapping("/queryByRid")
	public List<RolesPerms> queryByRid(@PathParam("rid")Integer rid){
		return JService.queryPerByRoles(rid);
	}
	@PostMapping("/addPer")
	public int addPer(@RequestBody List<RolesPerms> per) {
		return JService.addPer(per);
	}
	@PostMapping("/delPer")
	public int delPer(@RequestParam("rid") Integer rid) {
		return JService.delPer(rid);
	}
	@PutMapping("/upRole")
	public int upRole(@RequestBody Roles role) {
		return JService.upRole(role);
	}
	@PostMapping("/addRole")
	public int addRole(@RequestBody Roles role) {
		return JService.addRole(role);
	}
	@DeleteMapping("/delRole")
	public int delRole(Integer id) {
		return JService.delRole(id);
	}
	
}
