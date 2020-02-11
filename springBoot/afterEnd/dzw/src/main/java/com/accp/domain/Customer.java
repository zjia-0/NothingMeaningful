package com.accp.domain;

import java.util.Date;

public class Customer {
    private String cno;

    private String ctno;

    private String cname;

    private String cpeople;

    private String cphone;

    private String caddress;

    private Date cbirthday;

    private Integer cperiod;

    private Float climit;

    private String personnelid;

    private String cadviserphone;

    private String cprovince;

    private String cremark;

    private String ctaxes;

    private String cregistphone;

    private String cbank;

    private String cbanknumber;

    private String cdlicense;

    private String cregistaddress;

    private String ctname;
    
	private String vno;
    
    private Date vjoindate;
    
    private Date venddate;
    
    private Integer currentjifen;
    
    private Double money;
    
    private String personnelname;

	private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;

	public String getCtname() {
		return ctname;
	}

	public void setCtname(String ctname) {
		this.ctname = ctname;
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

	public Integer getCurrentjifen() {
		return currentjifen;
	}

	public void setCurrentjifen(Integer currentjifen) {
		this.currentjifen = currentjifen;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

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
    
    public String getPersonnelname() {
		return personnelname;
	}

	public void setPersonnelname(String personnelname) {
		this.personnelname = personnelname;
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

    public String getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(String personnelid) {
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
    

    
    public Customer(String cno, String ctno, String cname, String cpeople, String cphone, String caddress,
			Date cbirthday, Integer cperiod, Float climit, String personnelid, String cadviserphone, String cprovince,
			String cremark, String ctaxes, String cregistphone, String cbank, String cbanknumber, String cdlicense,
			String cregistaddress, String ctname, String vno, Date vjoindate, Date venddate, Integer currentjifen,
			Double money, String personnelname, String remark1, String remark2, String remark3, String remark4,
			String remark5) {
		super();
		this.cno = cno;
		this.ctno = ctno;
		this.cname = cname;
		this.cpeople = cpeople;
		this.cphone = cphone;
		this.caddress = caddress;
		this.cbirthday = cbirthday;
		this.cperiod = cperiod;
		this.climit = climit;
		this.personnelid = personnelid;
		this.cadviserphone = cadviserphone;
		this.cprovince = cprovince;
		this.cremark = cremark;
		this.ctaxes = ctaxes;
		this.cregistphone = cregistphone;
		this.cbank = cbank;
		this.cbanknumber = cbanknumber;
		this.cdlicense = cdlicense;
		this.cregistaddress = cregistaddress;
		this.ctname = ctname;
		this.vno = vno;
		this.vjoindate = vjoindate;
		this.venddate = venddate;
		this.currentjifen = currentjifen;
		this.money = money;
		this.personnelname = personnelname;
		this.remark1 = remark1;
		this.remark2 = remark2;
		this.remark3 = remark3;
		this.remark4 = remark4;
		this.remark5 = remark5;
	}

	public Customer() {

	}
}