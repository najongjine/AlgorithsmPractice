package com.biz.pay.exec;

public class PayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intAmount=3758750;
		int int50000Count=0;
		int int10000Count=0;
		int int5000Count=0;
		int int1000Count=0;
		int int500Count=0;
		int int100Count=0;
		int int50Count=0;
		int int10Count=0;
		
		int div=50000;
		
		int sw=1;
		for(; div>5 ;) {
			int count=intAmount/div;
			intAmount-=(count*div);
			System.out.printf("%d 원권: %d\n", div,count);
			if(sw>0) {
				div/=5;
			}else {
				div/=2;
			}
			sw*=-1;
		}
		
	}

}
