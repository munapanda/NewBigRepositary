package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private Integer cid;
	private String cname;
	private Double cfee;
	private String ctype;
	private Double discount;
	private Double gst;
	public Course(Integer cid, String cname, Double cfee, String ctype, Double discount, Double gst) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
		this.ctype = ctype;
		this.discount = discount;
		this.gst = gst;
	}
	public Course() {
		super();
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getCfee() {
		return cfee;
	}
	public void setCfee(Double cfee) {
		this.cfee = cfee;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getGst() {
		return gst;
	}
	public void setGst(Double gst) {
		this.gst = gst;
	}
	
}
