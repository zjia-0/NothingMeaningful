package com.accp.mapper;

import com.accp.domain.Billstype;
import com.accp.domain.BillstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillstypeMapper {
    int countByExample(BillstypeExample example);

    int deleteByExample(BillstypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Billstype record);

    int insertSelective(Billstype record);

    List<Billstype> selectByExample(BillstypeExample example);

    Billstype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Billstype record, @Param("example") BillstypeExample example);

    int updateByExample(@Param("record") Billstype record, @Param("example") BillstypeExample example);

    int updateByPrimaryKeySelective(Billstype record);

    int updateByPrimaryKey(Billstype record);
}