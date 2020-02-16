package com.accp.mapper;

import com.accp.domain.Original;
import com.accp.domain.OriginalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OriginalMapper {
    int countByExample(OriginalExample example);

    int deleteByExample(OriginalExample example);

    int deleteByPrimaryKey(String originalid);

    int insert(Original record);

    int insertSelective(Original record);

    List<Original> selectByExample(OriginalExample example);

    Original selectByPrimaryKey(String originalid);

    int updateByExampleSelective(@Param("record") Original record, @Param("example") OriginalExample example);

    int updateByExample(@Param("record") Original record, @Param("example") OriginalExample example);

    int updateByPrimaryKeySelective(Original record);

    int updateByPrimaryKey(Original record);
}