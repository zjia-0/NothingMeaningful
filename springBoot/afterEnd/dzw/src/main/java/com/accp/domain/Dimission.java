package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Dimission {
    private Integer dimissionid;

    private String departid;

    private String staffid;

    private String name;

    private String sex;

    private String post;
    
	/* @DateTimeFormat(pattern = "yyyy-MM-dd") */
    private String dimissiondate;

    private String cause;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;
    
    
    

    public Dimission( String departid, String staffid, String name, String sex, String post,
			String dimissiondate, String cause, String remark1) {
		super();
		
		this.departid = departid;
		this.staffid = staffid;
		this.name = name;
		this.sex = sex;
		this.post = post;
		this.dimissiondate = dimissiondate;
		this.cause = cause;
		this.remark1 = remark1;
	}
    
    

	public Dimission() {
		super();
	}



	public Integer getDimissionid() {
        return dimissionid;
    }

    public void setDimissionid(Integer dimissionid) {
        this.dimissionid = dimissionid;
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }



    public String getDimissiondate() {
		return dimissiondate;
	}



	public void setDimissiondate(String dimissiondate) {
		this.dimissiondate = dimissiondate;
	}



	public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
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