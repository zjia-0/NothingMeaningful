package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accp.domain.Project;
import com.accp.mapper.ProjectMapper;

@Service
@Transactional
public class ProjectService {
	@Autowired
	ProjectMapper ProjectMapper;
	
	public List<Project> projectselect(String pname){
		if (pname==""||pname==null) {
			return ProjectMapper.selectByExample(null);
		}
		return ProjectMapper.prosel(pname);
	}
	
	public int  projectdelete(int id) {
		return ProjectMapper.deleteByPrimaryKey(id);
	}
	
	public int projectinsert(Project project) {
		return ProjectMapper.insert(project);
	}
	
	public int projectupdate(Project project) {
		return ProjectMapper.updateByPrimaryKey(project);
	}
	
	public Project projectupse(int id) {
		return ProjectMapper.selectByPrimaryKey(id);
	}
	
}
