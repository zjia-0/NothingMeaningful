package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accp.domain.Project;
import com.accp.service.ProjectService;

@RestController
public class Projectcontroller {
	@Autowired
	ProjectService projectService;
	
	@PostMapping("/projectselect")
	public List<Project> projectselect(){
		return projectService.projectselect();
	}
	
	@PostMapping("/projectdelete")
	public int  projectdelete(int id) {
		return projectService.projectdelete(id);
	}
	
	@PostMapping("/projectinsert")
	public int projectinsert(Project project) {
		return projectService.projectinsert(project);
	}
	
	@PostMapping("/projectupdate")
	public int projectupdate(Project project) {
		return projectService.projectupdate(project);
	}
	
	@PostMapping("/projectupse")
	public Project projectupse(int id) {
		return projectService.projectupse(id);
	}
	
}
