package com.accp.mapper;

import com.accp.domain.Bills;
import com.accp.domain.BillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillsMapper {

	List<Bills> queryWeiXiu();//查询维修模块作业中车辆
	List<Bills> weixiuHistory(String cdlicense);//查询维修历史
	List<Bills> queryProject(String cdlicense);//查询维修项目
	List<Bills> queryLinliao(String cdlicense);//查询领料情况
	
	List<Bills> findbytj(Bills bill);
	List<Bills> findAllBills();

	int countByExample(BillsExample example);

	int deleteByExample(BillsExample example);

	int deleteByPrimaryKey(String bid);

	int insert(Bills record);

	int insertSelective(Bills record);

	List<Bills> selectByExample(BillsExample example);

	Bills selectByPrimaryKey(String bid);

	int updateByExampleSelective(@Param("record") Bills record, @Param("example") BillsExample example);

	int updateByExample(@Param("record") Bills record, @Param("example") BillsExample example);

	int updateByPrimaryKeySelective(Bills record);

	int updateByPrimaryKey(Bills record);
}