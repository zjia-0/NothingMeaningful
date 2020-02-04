package com.accp.mapper;

import com.accp.domain.Incometype;
import com.accp.domain.IncometypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IncometypeMapper {
    int countByExample(IncometypeExample example);

    int deleteByExample(IncometypeExample example);

    int deleteByPrimaryKey(Integer incomeid);

    int insert(Incometype record);

    int insertSelective(Incometype record);

    List<Incometype> selectByExample(IncometypeExample example);

    Incometype selectByPrimaryKey(Integer incomeid);

    int updateByExampleSelective(@Param("record") Incometype record, @Param("example") IncometypeExample example);

    int updateByExample(@Param("record") Incometype record, @Param("example") IncometypeExample example);

    int updateByPrimaryKeySelective(Incometype record);

    int updateByPrimaryKey(Incometype record);
}