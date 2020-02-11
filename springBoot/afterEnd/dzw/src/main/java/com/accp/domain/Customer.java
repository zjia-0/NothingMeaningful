package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Customer {
    private String cno;

    private String ctno;

    private String cname;

    private String cpeople;

    private String cphone;

    private String caddress;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cbirthday;

    private Integer cperiod;

    private Float climit;

    private Integer personnelid;

    private String cadviserphone;

    private String cprovince;

    private String cremark;

    private String ctaxes;

    private String cregistphone;

    private String cbank;

    private String cbanknumber;

    private String cdlicense;

    private String cregistaddress;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCtno() {
        return ctno;
    }

    public void setCtno(String ctno) {
        this.ctno = ctno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpeople() {
        return cpeople;
    }

    public void setCpeople(String cpeople) {
        this.cpeople = cpeople;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public Date getCbirthday() {
        return cbirthday;
    }

    public void setCbirthday(Date cbirthday) {
        this.cbirthday = cbirthday;
    }

    public Integer getCperiod() {
        return cperiod;
    }

    public void setCperiod(Integer cperiod) {
        this.cperiod = cperiod;
    }

    public Float getClimit() {
        return climit;
    }

    public void setClimit(Float climit) {
        this.climit = climit;
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public String getCadviserphone() {
        return cadviserphone;
    }

    public void setCadviserphone(String cadviserphone) {
        this.cadviserphone = cadviserphone;
    }

    public String getCprovince() {
        return cprovince;
    }

    public void setCprovince(String cprovince) {
        this.cprovince = cprovince;
    }

    public String getCremark() {
        return cremark;
    }

    public void setCremark(String cremark) {
        this.cremark = cremark;
    }

    public String getCtaxes() {
        return ctaxes;
    }

    public void setCtaxes(String ctaxes) {
        this.ctaxes = ctaxes;
    }

    public String getCregistphone() {
        return cregistphone;
    }

    public void setCregistphone(String cregistphone) {
        this.cregistphone = cregistphone;
    }

    public String getCbank() {
        return cbank;
    }

    public void setCbank(String cbank) {
        this.cbank = cbank;
    }

    public String getCbanknumber() {
        return cbanknumber;
    }

    public void setCbanknumber(String cbanknumber) {
        this.cbanknumber = cbanknumber;
    }

    public String getCdlicense() {
        return cdlicense;
    }

    public void setCdlicense(String cdlicense) {
        this.cdlicense = cdlicense;
    }

    public String getCregistaddress() {
        return cregistaddress;
    }

    public void setCregistaddress(String cregistaddress) {
        this.cregistaddress = cregistaddress;
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