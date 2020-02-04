package com.accp.mapper;

import com.accp.domain.Engine;
import com.accp.domain.EngineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineMapper {
    int countByExample(EngineExample example);

    int deleteByExample(EngineExample example);

    int deleteByPrimaryKey(Integer motorid);

    int insert(Engine record);

    int insertSelective(Engine record);

    List<Engine> selectByExample(EngineExample example);

    Engine selectByPrimaryKey(Integer motorid);

    int updateByExampleSelective(@Param("record") Engine record, @Param("example") EngineExample example);

    int updateByExample(@Param("record") Engine record, @Param("example") EngineExample example);

    int updateByPrimaryKeySelective(Engine record);

    int updateByPrimaryKey(Engine record);
}