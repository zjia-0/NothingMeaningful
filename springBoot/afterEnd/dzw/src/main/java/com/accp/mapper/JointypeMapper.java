package com.accp.mapper;

import com.accp.domain.Jointype;
import com.accp.domain.JointypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JointypeMapper {
    int countByExample(JointypeExample example);

    int deleteByExample(JointypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jointype record);

    int insertSelective(Jointype record);

    List<Jointype> selectByExample(JointypeExample example);

    Jointype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jointype record, @Param("example") JointypeExample example);

    int updateByExample(@Param("record") Jointype record, @Param("example") JointypeExample example);

    int updateByPrimaryKeySelective(Jointype record);

    int updateByPrimaryKey(Jointype record);
}