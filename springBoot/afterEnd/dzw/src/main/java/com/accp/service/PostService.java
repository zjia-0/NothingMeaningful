package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.domain.Artisanstars;
import com.accp.domain.Post;
import com.accp.mapper.PostMapper;

@Service
@Transactional
public class PostService {

	@Autowired
	PostMapper pmapper;
	
	//主页查询
		public List<Post> select(){
			return pmapper.selectByExample(null);
		}
		
		//根据点击进行单个查询
		public Post selectid(int postid) {
			return pmapper.selectByPrimaryKey(postid);
		}
		
		//修改
		public int ArtisanstarsUpdate(Post art) {
			return pmapper.updateByPrimaryKey(art);
		}
		
		//新增
		public int ArtisanstarsAdd(Post art) {
			return pmapper.insert(art);
		}
		
		//删除
		public int ArtisanstarsRemove(int postid) {
			return pmapper.deleteByPrimaryKey(postid);
		}
}
