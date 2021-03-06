package com.accp.mapper;

import com.accp.domain.Vip;
import com.accp.domain.VipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipMapper {
	int updateVip(Vip vip);

	List<Vip> findVipsisok(String cno);

	int upMoney(Vip vip);

	int jifenReset(String vno);

	int upZt(String vno);

	List<Vip> findMaxCno();

	List<Vip> findVipByname(String name);

	int findstarjifen(int levelid);

	int countByExample(VipExample example);

	int deleteByExample(VipExample example);

	int deleteByPrimaryKey(String vno);

	int insert(Vip record);

	int insertSelective(Vip record);

	List<Vip> selectByExample(VipExample example);

	Vip selectByPrimaryKey(String vno);

	int updateByExampleSelective(@Param("record") Vip record, @Param("example") VipExample example);

	int updateByExample(@Param("record") Vip record, @Param("example") VipExample example);

	int updateByPrimaryKeySelective(Vip record);

	int updateByPrimaryKey(Vip record);
}