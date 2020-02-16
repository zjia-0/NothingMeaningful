package com.accp.domain;

public class Vendor {
	
	private String supcode;
	private String supname;
	private String address;
	private String scase;
	private String url;
	private String bank;
	private String banknum;
	private String way;
	private String grade;
	private String brand;
	private String unitsname;
	private String contacts;
	private String phone;
	private String mobile;
	private String email;
	private String days;
	private String remark;
	
	public Vendor(String supcode, String supname, String address, String scase, String url, String bank, String banknum,
			String way, String grade, String brand, String unitsname, String contacts, String phone, String mobile,
			String email, String days, String remark) {
		super();
		this.supcode = supcode;
		this.supname = supname;
		this.address = address;
		this.scase = scase;
		this.url = url;
		this.bank = bank;
		this.banknum = banknum;
		this.way = way;
		this.grade = grade;
		this.brand = brand;
		this.unitsname = unitsname;
		this.contacts = contacts;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.days = days;
		this.remark = remark;
	}
	public Vendor() {
		super();
	}
	public String getSupcode() {
		return supcode;
	}
	public void setSupcode(String supcode) {
		this.supcode = supcode;
	}
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getScase() {
		return scase;
	}
	public void setScase(String scase) {
		this.scase = scase;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBanknum() {
		return banknum;
	}
	public void setBanknum(String banknum) {
		this.banknum = banknum;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getUnitsname() {
		return unitsname;
	}
	public void setUnitsname(String unitsname) {
		this.unitsname = unitsname;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
