package com.biz.phonebook.service;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookServiceImp {
	protected List<PhoneBookVO> phoneVOList;
	protected PhoneBookVO _phoneVO;
	
	public PhoneBookServiceImp() {
		super();
		// TODO Auto-generated constructor stub
		phoneVOList=new ArrayList<PhoneBookVO>();
	}

	public void addPhoneToList1() {
		_phoneVO=new PhoneBookVO();
		_phoneVO.setPhoneNum("12");
		phoneVOList.add(_phoneVO);
		
		_phoneVO=new PhoneBookVO();
		_phoneVO.setPhoneNum("123");
		phoneVOList.add(_phoneVO);
		
		_phoneVO=new PhoneBookVO();
		_phoneVO.setPhoneNum("1235");
		phoneVOList.add(_phoneVO);
		
		_phoneVO=new PhoneBookVO();
		_phoneVO.setPhoneNum("567");
		phoneVOList.add(_phoneVO);
		
		_phoneVO=new PhoneBookVO();
		_phoneVO.setPhoneNum("88");
		phoneVOList.add(_phoneVO);
		
		System.out.println(phoneVOList.toString());
	}
	public void addPhoneToList2() {
		_phoneVO=new PhoneBookVO();
		_phoneVO.setPhoneNum("123");
		phoneVOList.add(_phoneVO);
		
		_phoneVO=new PhoneBookVO();
		_phoneVO.setPhoneNum("456");
		phoneVOList.add(_phoneVO);
		
		_phoneVO=new PhoneBookVO();
		_phoneVO.setPhoneNum("789");
		phoneVOList.add(_phoneVO);
		
		System.out.println(phoneVOList.toString());
	}
	public boolean checkPrefix() {
		int nSize=phoneVOList.size();
		for(int i=0;i<nSize;i++) {
			for(int j=0;j<nSize;j++) {
				if(i==j) continue;
				if(phoneVOList.get(i).getPhoneNum().contains(phoneVOList.get(j).getPhoneNum()))
					return true;
			}
		}
		return false;
	}
}
