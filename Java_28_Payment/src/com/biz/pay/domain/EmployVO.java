package com.biz.pay.domain;

import java.util.ArrayList;
import java.util.List;

public class EmployVO {
	//private PaperVO paperVO;
	int amount;
	String id;
	private List<PaperVO> paperVOList;

	public EmployVO() {
		super();
		// TODO Auto-generated constructor stub
		paperVOList=new ArrayList<PaperVO>();
	}

	public EmployVO(List<PaperVO> paperVOList) {
		super();
		this.paperVOList = paperVOList;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<PaperVO> getPaperVOList() {
		return paperVOList;
	}

	public void setPaperVOList(List<PaperVO> paperVOList) {
		this.paperVOList = paperVOList;
	}
	
	
}
