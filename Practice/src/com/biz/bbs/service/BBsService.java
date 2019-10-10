package com.biz.bbs.service;

public class BBsService {
	int num;
	String title;
	String memo;
	
	public BBsService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BBsService(int num, String title, String memo) {
		super();
		this.num = num;
		this.title = title;
		this.memo = memo;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
