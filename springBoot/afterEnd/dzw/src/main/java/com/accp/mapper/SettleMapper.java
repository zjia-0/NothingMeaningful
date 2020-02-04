package com.accp.mapper;

import com.accp.domain.Settle;
import com.accp.domain.SettleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettleMapper {
    int countByExample(SettleExample example);

    int deleteByExample(SettleExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Settle record);

    int insertSelective(Settle record);

    List<Settle> selectByExample(SettleExample example);

    Settle selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Settle record, @Param("example") SettleExample example);

    int updateByExample(@Param("record") Settle record, @Param("example") SettleExample example);

    int updateByPrimaryKeySelective(Settle record);

    int updateByPrimaryKey(Settle record);
}