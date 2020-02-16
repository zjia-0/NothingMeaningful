package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Goods;
import com.accp.domain.goodsdata;
import com.accp.mapper.GoodsMapper;

@Service
@Transactional
public class GoodService {
	@Autowired
	GoodsMapper goodsMapper;
	
	public List<goodsdata> goodsel(){
		return goodsMapper.goodsel();
	}
	
	public int goodsins(Goods goods) {
		return goodsMapper.insert(goods);
	}
	
	public int goodupd(Goods goods) {
		return goodsMapper.updateByPrimaryKey(goods);
	}
	
	public Goods goodupdsel(int gid) {
		return goodsMapper.selectByPrimaryKey(gid);
	}
	
	public int gooddelete(int gid) {
		return goodsMapper.deleteByPrimaryKey(gid);
	}
}
