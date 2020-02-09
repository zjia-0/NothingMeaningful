package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Artisanstars;
import com.accp.domain.Post;
import com.accp.service.PostService;

@RestController
public class PostController {
//岗位定义
	@Autowired
	PostService pservice;
	
	@PostMapping("/Pselect")
	public List<Post> select(){
		return pservice.select();
	}
	
	//根据点击进行单个查询
	@PostMapping("/Pselectid")
	public Post selectid(int postid) {
		return pservice.selectid(postid);
	}
	
	//修改
	@PostMapping("/Postupdate")
	public int ArtisanstarsUpdate(Post starleve) {
		return pservice.ArtisanstarsUpdate(starleve);
	}
	
	//新增
	@PostMapping("/Postadd")
	public int ArtisanstarsAdd(Post art) {
		return pservice.ArtisanstarsAdd(art);
	}
	
	//删除
	@PostMapping("/PostRemove")
	public int ArtisanstarsRemove(int postid) {
		return pservice.ArtisanstarsRemove(postid);
	}
}
