package com.accp.mapper;

import com.accp.domain.Goods;
import com.accp.domain.GoodsExample;
import com.accp.domain.goodsdata;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);
    
    List<goodsdata> goodsel();
    
    List<goodsdata> goodselmc(String typename);
    
    List<goodsdata> goodselwb(String gid ,String gname,String brandname,String typename);
    
    List<goodsdata> goodseltc(String gid,String gname,String brandname,String applycar);

    Goods selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}