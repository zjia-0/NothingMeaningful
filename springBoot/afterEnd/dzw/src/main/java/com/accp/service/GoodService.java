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
	
	public List<goodsdata> goodsel(String typenames,String mcs,String fccx,String fcdm,String fcmc,String fcpp){
		System.out.println(mcs);
		System.out.println(typenames);
		System.out.println(fccx);
		System.out.println(fcdm);
		
		if (typenames=="" || typenames==null && mcs==""||mcs==null && fccx==""||fccx==null && fcmc=="" && fcdm=="" && fcpp=="") {
			return goodsMapper.goodsel();
		}else if (typenames=="" || typenames==null && fcdm.equals("") ||fcdm.equals(null) && fcmc.equals("") && fcdm.equals("") && fcpp.equals("")&&mcs!=null||mcs!="") {
			return goodsMapper.goodselwb(mcs, mcs, mcs,mcs);
		}else if (mcs.equals("") || mcs.equals(null) &&fccx.equals("") ||fccx.equals(null)&& fcmc.equals("") && fccx.equals("") && fcpp.equals("")&&typenames!=""||typenames!=null) {
			return goodsMapper.goodselmc(typenames);
		}else if (typenames.equals("")|| typenames==null && mcs.equals("") && fccx!="" || fcmc!="" || fcdm!="" || fcpp!="") {
			return goodsMapper.goodseltc(fcdm, fcmc, fccx, fcpp);
		}
		return goodsMapper.goodsel();
	}
	
	public List<goodsdata> find(){
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
