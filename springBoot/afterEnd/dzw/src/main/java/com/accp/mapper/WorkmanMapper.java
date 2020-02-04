package com.accp.mapper;

import com.accp.domain.Workman;
import com.accp.domain.WorkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkmanMapper {
    int countByExample(WorkmanExample example);

    int deleteByExample(WorkmanExample example);

    int deleteByPrimaryKey(String workid);

    int insert(Workman record);

    int insertSelective(Workman record);

    List<Workman> selectByExample(WorkmanExample example);

    Workman selectByPrimaryKey(String workid);

    int updateByExampleSelective(@Param("record") Workman record, @Param("example") WorkmanExample example);

    int updateByExample(@Param("record") Workman record, @Param("example") WorkmanExample example);

    int updateByPrimaryKeySelective(Workman record);

    int updateByPrimaryKey(Workman record);
}