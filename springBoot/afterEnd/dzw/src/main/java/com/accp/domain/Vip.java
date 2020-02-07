package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Vip {
    private String vno;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date vjoindate;

    private String viplevel;
    
    private String cname;
    
    private String cphone;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date venddate;

    private String cno;

    private Integer levelid;

    private Integer currentjifen;

    private Double summoney;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;

    private Double money;

    public String getViplevel() {
		return viplevel;
	}

	public void setViplevel(String viplevel) {
		this.viplevel = viplevel;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getVno() {
        return vno;
    }

    public void setVno(String vno) {
        this.vno = vno;
    }

    public Date getVjoindate() {
        return vjoindate;
    }

    public void setVjoindate(Date vjoindate) {
        this.vjoindate = vjoindate;
    }

    public Date getVenddate() {
        return venddate;
    }

    public void setVenddate(Date venddate) {
        this.venddate = venddate;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public Integer getCurrentjifen() {
        return currentjifen;
    }

    public void setCurrentjifen(Integer currentjifen) {
        this.currentjifen = currentjifen;
    }

    public Double getSummoney() {
        return summoney;
    }

    public void setSummoney(Double summoney) {
        this.summoney = summoney;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}