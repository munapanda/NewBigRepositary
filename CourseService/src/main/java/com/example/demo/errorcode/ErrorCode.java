package com.example.demo.errorcode;

public class ErrorCode {
	private String messege;
	private String date;
	private String code;
	private String module;
	public ErrorCode(String messege, String date, String code, String module) {
		super();
		this.messege = messege;
		this.date = date;
		this.code = code;
		this.module = module;
	}
	public ErrorCode() {
		super();
	}
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	

}
