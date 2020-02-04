package com.accp.mapper;

import com.accp.domain.Artisanstars;
import com.accp.domain.ArtisanstarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtisanstarsMapper {
    int countByExample(ArtisanstarsExample example);

    int deleteByExample(ArtisanstarsExample example);

    int deleteByPrimaryKey(Integer starleveid);

    int insert(Artisanstars record);

    int insertSelective(Artisanstars record);

    List<Artisanstars> selectByExample(ArtisanstarsExample example);

    Artisanstars selectByPrimaryKey(Integer starleveid);

    int updateByExampleSelective(@Param("record") Artisanstars record, @Param("example") ArtisanstarsExample example);

    int updateByExample(@Param("record") Artisanstars record, @Param("example") ArtisanstarsExample example);

    int updateByPrimaryKeySelective(Artisanstars record);

    int updateByPrimaryKey(Artisanstars record);
}