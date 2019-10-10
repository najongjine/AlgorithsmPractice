package com.biz.test.exec;

import com.biz.test.service.TestService;

public class TestEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestService ts1=new TestService();
		TestService ts2=new TestService();
		ts1.a=2;
		ts1.c=5;
		System.out.println(ts1.c);
		System.out.println(ts2.c);
		
	}

}
