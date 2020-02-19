package com.accp.domain;

import java.util.List;

public class Project {
    private Integer id;

    private Integer maintainid;

    private String pnum;

    private String pname;

    private Integer incomeid;

    private Float standardprice;

    private Float memberprice;

    private Float vipprice;

    private Float dealprice;

    private Float claimprice;

    private Float insuranceprice;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;
    
    private List<Incometype> incometype;
    
    private List<Maintaintype> maintaintype;

    
    public List<Incometype> getIncometype() {
		return incometype;
	}

	public void setIncometype(List<Incometype> incometype) {
		this.incometype = incometype;
	}

	public List<Maintaintype> getMaintaintype() {
		return maintaintype;
	}

	public void setMaintaintype(List<Maintaintype> maintaintype) {
		this.maintaintype = maintaintype;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaintainid() {
        return maintainid;
    }

    public void setMaintainid(Integer maintainid) {
        this.maintainid = maintainid;
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

    public Integer getIncomeid() {
        return incomeid;
    }

    public void setIncomeid(Integer incomeid) {
        this.incomeid = incomeid;
    }

    public Float getStandardprice() {
        return standardprice;
    }

    public void setStandardprice(Float standardprice) {
        this.standardprice = standardprice;
    }

    public Float getMemberprice() {
        return memberprice;
    }

    public void setMemberprice(Float memberprice) {
        this.memberprice = memberprice;
    }

    public Float getVipprice() {
        return vipprice;
    }

    public void setVipprice(Float vipprice) {
        this.vipprice = vipprice;
    }

    public Float getDealprice() {
        return dealprice;
    }

    public void setDealprice(Float dealprice) {
        this.dealprice = dealprice;
    }

    public Float getClaimprice() {
        return claimprice;
    }

    public void setClaimprice(Float claimprice) {
        this.claimprice = claimprice;
    }

    public Float getInsuranceprice() {
        return insuranceprice;
    }

    public void setInsuranceprice(Float insuranceprice) {
        this.insuranceprice = insuranceprice;
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