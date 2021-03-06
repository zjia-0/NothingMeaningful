package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Bills {
	private String rbname;
	private String mbname;
	private String personnelname;
	private String billname;
	private String cname;
	private String cartype;
	private String cphone;
	private int astate;
	private String bid;
	private String aname;
	private String cdframe;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date atime;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date starttime;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endtime;
	private Integer bstate;

	private Integer cno;
	private String cdlicense;

	private String pno;

	private Integer btid;

	private Integer id;

	private Integer pmid;

	private Integer inid;

	private Integer qualified;

	private Integer reworknum;

	private String respeople;

	private String delaysreason;

	private String reworkreason;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expectedtime;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date completiontime;

	private Float penaltyamount;

	private String qmember;

	private String pickcar;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ordertime;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date clearingtime;

	private Float forecastmoney;

	private String remark1;

	private String remark2;

	private String remark3;

	private String remark4;

	private String remark5;
	
	//查询作业中车辆需要添加的属性
	private String vno;
	private String bname;
	private String jcr;

	//查询维修历史需要添加属性'total'
	private float total;
	
	//查询维修项目需要添加的属性
	private String pnum;
	private String pname;
	private String ptname;
	private float bpreferentialM;
	private String faultdescription;
	private String problem;
	
	//查询领料情况
	private Integer type;
	private Integer gid;
	private String gname;
	private String unit;
	private Integer number;
	private float frontPrice;
	private float laterPrice;
	private float price;
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public float getFrontPrice() {
		return frontPrice;
	}

	public void setFrontPrice(float frontPrice) {
		this.frontPrice = frontPrice;
	}

	public float getLaterPrice() {
		return laterPrice;
	}

	public void setLaterPrice(float laterPrice) {
		this.laterPrice = laterPrice;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtname() {
		return ptname;
	}

	public void setPtname(String ptname) {
		this.ptname = ptname;
	}

	public float getBpreferentialM() {
		return bpreferentialM;
	}

	public void setBpreferentialM(float bpreferentialM) {
		this.bpreferentialM = bpreferentialM;
	}

	public String getFaultdescription() {
		return faultdescription;
	}

	public void setFaultdescription(String faultdescription) {
		this.faultdescription = faultdescription;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getVno() {
		return vno;
	}

	public void setVno(String vno) {
		this.vno = vno;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getJcr() {
		return jcr;
	}

	public void setJcr(String jcr) {
		this.jcr = jcr;
	}
	
	public String getCdframe() {
		return cdframe;
	}

	public void setCdframe(String cdframe) {
		this.cdframe = cdframe;
	}

	public Date getAtime() {
		return atime;
	}

	public void setAtime(Date atime) {
		this.atime = atime;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public int getAstate() {
		return astate;
	}

	public void setAstate(int astate) {
		this.astate = astate;
	}

	public String getRbname() {
		return rbname;
	}

	public void setRbname(String rbname) {
		this.rbname = rbname;
	}

	public String getMbname() {
		return mbname;
	}

	public void setMbname(String mbname) {
		this.mbname = mbname;
	}

	public String getPersonnelname() {
		return personnelname;
	}

	public void setPersonnelname(String personnelname) {
		this.personnelname = personnelname;
	}

	public String getBillname() {
		return billname;
	}

	public void setBillname(String billname) {
		this.billname = billname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public Integer getBstate() {
		return bstate;
	}

	public void setBstate(Integer bstate) {
		this.bstate = bstate;
	}

	public String getCdlicense() {
		return cdlicense;
	}

	public void setCdlicense(String cdlicense) {
		this.cdlicense = cdlicense;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public Integer getBtid() {
		return btid;
	}

	public void setBtid(Integer btid) {
		this.btid = btid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPmid() {
		return pmid;
	}

	public void setPmid(Integer pmid) {
		this.pmid = pmid;
	}

	public Integer getInid() {
		return inid;
	}

	public void setInid(Integer inid) {
		this.inid = inid;
	}

	public Integer getQualified() {
		return qualified;
	}

	public void setQualified(Integer qualified) {
		this.qualified = qualified;
	}

	public Integer getReworknum() {
		return reworknum;
	}

	public void setReworknum(Integer reworknum) {
		this.reworknum = reworknum;
	}

	public String getRespeople() {
		return respeople;
	}

	public void setRespeople(String respeople) {
		this.respeople = respeople;
	}

	public String getDelaysreason() {
		return delaysreason;
	}

	public void setDelaysreason(String delaysreason) {
		this.delaysreason = delaysreason;
	}

	public String getReworkreason() {
		return reworkreason;
	}

	public void setReworkreason(String reworkreason) {
		this.reworkreason = reworkreason;
	}

	public Date getExpectedtime() {
		return expectedtime;
	}

	public void setExpectedtime(Date expectedtime) {
		this.expectedtime = expectedtime;
	}

	public Date getCompletiontime() {
		return completiontime;
	}

	public void setCompletiontime(Date completiontime) {
		this.completiontime = completiontime;
	}

	public Float getPenaltyamount() {
		return penaltyamount;
	}

	public void setPenaltyamount(Float penaltyamount) {
		this.penaltyamount = penaltyamount;
	}

	public String getQmember() {
		return qmember;
	}

	public void setQmember(String qmember) {
		this.qmember = qmember;
	}

	public String getPickcar() {
		return pickcar;
	}

	public void setPickcar(String pickcar) {
		this.pickcar = pickcar;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public Date getClearingtime() {
		return clearingtime;
	}

	public void setClearingtime(Date clearingtime) {
		this.clearingtime = clearingtime;
	}

	public Float getForecastmoney() {
		return forecastmoney;
	}

	public void setForecastmoney(Float forecastmoney) {
		this.forecastmoney = forecastmoney;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	public String getRemark4() {
		return remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	public String getRemark5() {
		return remark5;
	}

	public void setRemark5(String remark5) {
		this.remark5 = remark5;
	}
}