package com.accp.mapper;

import com.accp.domain.Carbrandinfo;
import com.accp.domain.CarbrandinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarbrandinfoMapper {
    int countByExample(CarbrandinfoExample example);

    int deleteByExample(CarbrandinfoExample example);

    int deleteByPrimaryKey(String cid);

    int insert(Carbrandinfo record);

    int insertSelective(Carbrandinfo record);

    List<Carbrandinfo> selectByExample(CarbrandinfoExample example);
    
    List<Carbrandinfo> select(String con);

    Carbrandinfo selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") Carbrandinfo record, @Param("example") CarbrandinfoExample example);

    int updateByExample(@Param("record") Carbrandinfo record, @Param("example") CarbrandinfoExample example);

    int updateByPrimaryKeySelective(Carbrandinfo record);

    int updateByPrimaryKey(Carbrandinfo record);
}