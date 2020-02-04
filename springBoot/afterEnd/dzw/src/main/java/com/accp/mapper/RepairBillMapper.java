package com.accp.mapper;

import com.accp.domain.RepairBill;
import com.accp.domain.RepairBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairBillMapper {
    int countByExample(RepairBillExample example);

    int deleteByExample(RepairBillExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(RepairBill record);

    int insertSelective(RepairBill record);

    List<RepairBill> selectByExample(RepairBillExample example);

    RepairBill selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") RepairBill record, @Param("example") RepairBillExample example);

    int updateByExample(@Param("record") RepairBill record, @Param("example") RepairBillExample example);

    int updateByPrimaryKeySelective(RepairBill record);

    int updateByPrimaryKey(RepairBill record);
}