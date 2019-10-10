package com.biz.phonebook;

import com.biz.phonebook.service.PhoneBookServiceImp;

public class PhoneBookEx {
	public static void main(String[] args) {
		PhoneBookServiceImp phS=new PhoneBookServiceImp();
		
		phS.addPhoneToList2();
		boolean bVar=phS.checkPrefix();
		
		if(bVar) System.out.println("not contains prefix false");
		else System.out.println("not contains prefix true");
	}
}
