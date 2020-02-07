package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Carinfo {
    private String cdlicense;

    private String cdno;

    private String cbiid;

    private String cddricer;

    private String cddriverphone;

    @DateTimeFormat(pattern = "yy-MM-dd")
    private Date cddriverbirth;

    private Integer clid;
    
    @DateTimeFormat(pattern = "yy-MM-dd")
    private Date cdlicenseend;

    private String cdframe;

    private String cdengine;

    private Float cdyearprice;

    private Float cdmileage;

    private String cdload;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdbuydate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdgolicense;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdcarcheckdate;

    private Integer fuelid;

    private String cdsystem;

    private Integer cdcompulsoryinsuranceid;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdcompulsoryinsurancedate;

    private Integer cdcommerceinsuranceid;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdcommerceinsurancedate;

    private Integer cdisinsure;

    private Float cdnextmileage;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdnextkeep;

    private String cno;
    
    private String brandname;
    
    private String cname;
    
    private String carname;
    
    private String motorname;
    
    private String fuelname;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;

    public String getCdlicense() {
        return cdlicense;
    }

    public void setCdlicense(String cdlicense) {
        this.cdlicense = cdlicense;
    }

    public String getCdno() {
        return cdno;
    }

    public void setCdno(String cdno) {
        this.cdno = cdno;
    }

    public String getCbiid() {
        return cbiid;
    }

    public void setCbiid(String cbiid) {
        this.cbiid = cbiid;
    }

    public String getCddricer() {
        return cddricer;
    }

    public void setCddricer(String cddricer) {
        this.cddricer = cddricer;
    }

    public String getCddriverphone() {
        return cddriverphone;
    }

    public void setCddriverphone(String cddriverphone) {
        this.cddriverphone = cddriverphone;
    }

    public Date getCddriverbirth() {
        return cddriverbirth;
    }

    public void setCddriverbirth(Date cddriverbirth) {
        this.cddriverbirth = cddriverbirth;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Date getCdlicenseend() {
        return cdlicenseend;
    }

    public void setCdlicenseend(Date cdlicenseend) {
        this.cdlicenseend = cdlicenseend;
    }

    public String getCdframe() {
        return cdframe;
    }

    public void setCdframe(String cdframe) {
        this.cdframe = cdframe;
    }

    public String getCdengine() {
        return cdengine;
    }

    public void setCdengine(String cdengine) {
        this.cdengine = cdengine;
    }

    public Float getCdyearprice() {
        return cdyearprice;
    }

    public void setCdyearprice(Float cdyearprice) {
        this.cdyearprice = cdyearprice;
    }

    public Float getCdmileage() {
        return cdmileage;
    }

    public void setCdmileage(Float cdmileage) {
        this.cdmileage = cdmileage;
    }

    public String getCdload() {
        return cdload;
    }

    public void setCdload(String cdload) {
        this.cdload = cdload;
    }

    public Date getCdbuydate() {
        return cdbuydate;
    }

    public void setCdbuydate(Date cdbuydate) {
        this.cdbuydate = cdbuydate;
    }

    public Date getCdgolicense() {
        return cdgolicense;
    }

    public void setCdgolicense(Date cdgolicense) {
        this.cdgolicense = cdgolicense;
    }

    public Date getCdcarcheckdate() {
        return cdcarcheckdate;
    }

    public void setCdcarcheckdate(Date cdcarcheckdate) {
        this.cdcarcheckdate = cdcarcheckdate;
    }

    public Integer getFuelid() {
        return fuelid;
    }

    public void setFuelid(Integer fuelid) {
        this.fuelid = fuelid;
    }

    public String getCdsystem() {
        return cdsystem;
    }

    public void setCdsystem(String cdsystem) {
        this.cdsystem = cdsystem;
    }

    public Integer getCdcompulsoryinsuranceid() {
        return cdcompulsoryinsuranceid;
    }

    public void setCdcompulsoryinsuranceid(Integer cdcompulsoryinsuranceid) {
        this.cdcompulsoryinsuranceid = cdcompulsoryinsuranceid;
    }

    public Date getCdcompulsoryinsurancedate() {
        return cdcompulsoryinsurancedate;
    }

    public void setCdcompulsoryinsurancedate(Date cdcompulsoryinsurancedate) {
        this.cdcompulsoryinsurancedate = cdcompulsoryinsurancedate;
    }

    public Integer getCdcommerceinsuranceid() {
        return cdcommerceinsuranceid;
    }

    public void setCdcommerceinsuranceid(Integer cdcommerceinsuranceid) {
        this.cdcommerceinsuranceid = cdcommerceinsuranceid;
    }

    public Date getCdcommerceinsurancedate() {
        return cdcommerceinsurancedate;
    }

    public void setCdcommerceinsurancedate(Date cdcommerceinsurancedate) {
        this.cdcommerceinsurancedate = cdcommerceinsurancedate;
    }

    public Integer getCdisinsure() {
        return cdisinsure;
    }

    public void setCdisinsure(Integer cdisinsure) {
        this.cdisinsure = cdisinsure;
    }

    public Float getCdnextmileage() {
        return cdnextmileage;
    }

    public void setCdnextmileage(Float cdnextmileage) {
        this.cdnextmileage = cdnextmileage;
    }

    public Date getCdnextkeep() {
        return cdnextkeep;
    }

    public void setCdnextkeep(Date cdnextkeep) {
        this.cdnextkeep = cdnextkeep;
    }

    public Carinfo(String cdlicense, String cdno, String cbiid, String cddricer, String cddriverphone,
			Date cddriverbirth, Integer clid, Date cdlicenseend, String cdframe, String cdengine, Float cdyearprice,
			Float cdmileage, String cdload, Date cdbuydate, Date cdgolicense, Date cdcarcheckdate, Integer fuelid,
			String cdsystem, Integer cdcompulsoryinsuranceid, Date cdcompulsoryinsurancedate,
			Integer cdcommerceinsuranceid, Date cdcommerceinsurancedate, Integer cdisinsure, Float cdnextmileage,
			Date cdnextkeep, String cno, String brandname, String cname, String carname, String motorname,
			String fuelname, String remark1, String remark2, String remark3, String remark4, String remark5) {
		super();
		this.cdlicense = cdlicense;
		this.cdno = cdno;
		this.cbiid = cbiid;
		this.cddricer = cddricer;
		this.cddriverphone = cddriverphone;
		this.cddriverbirth = cddriverbirth;
		this.clid = clid;
		this.cdlicenseend = cdlicenseend;
		this.cdframe = cdframe;
		this.cdengine = cdengine;
		this.cdyearprice = cdyearprice;
		this.cdmileage = cdmileage;
		this.cdload = cdload;
		this.cdbuydate = cdbuydate;
		this.cdgolicense = cdgolicense;
		this.cdcarcheckdate = cdcarcheckdate;
		this.fuelid = fuelid;
		this.cdsystem = cdsystem;
		this.cdcompulsoryinsuranceid = cdcompulsoryinsuranceid;
		this.cdcompulsoryinsurancedate = cdcompulsoryinsurancedate;
		this.cdcommerceinsuranceid = cdcommerceinsuranceid;
		this.cdcommerceinsurancedate = cdcommerceinsurancedate;
		this.cdisinsure = cdisinsure;
		this.cdnextmileage = cdnextmileage;
		this.cdnextkeep = cdnextkeep;
		this.cno = cno;
		this.brandname = brandname;
		this.cname = cname;
		this.carname = carname;
		this.motorname = motorname;
		this.fuelname = fuelname;
		this.remark1 = remark1;
		this.remark2 = remark2;
		this.remark3 = remark3;
		this.remark4 = remark4;
		this.remark5 = remark5;
	}
    public Carinfo() { }

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getMotorname() {
		return motorname;
	}

	public void setMotorname(String motorname) {
		this.motorname = motorname;
	}

	public String getFuelname() {
		return fuelname;
	}

	public void setFuelname(String fuelname) {
		this.fuelname = fuelname;
	}

	public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
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