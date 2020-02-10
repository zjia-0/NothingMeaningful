package com.accp.mapper;

import com.accp.domain.Distinction;
import com.accp.domain.DistinctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistinctionMapper {
    int countByExample(DistinctionExample example);

    int deleteByExample(DistinctionExample example);

    int deleteByPrimaryKey(Integer disid);

    int insert(Distinction record);

    int insertSelective(Distinction record);

    List<Distinction> selectByExample(DistinctionExample example);

    Distinction selectByPrimaryKey(Integer disid);

    int updateByExampleSelective(@Param("record") Distinction record, @Param("example") DistinctionExample example);

    int updateByExample(@Param("record") Distinction record, @Param("example") DistinctionExample example);

    int updateByPrimaryKeySelective(Distinction record);

    int updateByPrimaryKey(Distinction record);
}