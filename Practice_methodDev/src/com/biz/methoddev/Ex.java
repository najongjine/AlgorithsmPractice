package com.biz.methoddev;

import java.util.List;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution=new Solution();
		int[] progresses= {
		20,33,10,22,5
		};
		int[] speeds= {
				30,22,41,10,11
		};
		List<Integer> ordersList=solution.solution(progresses, speeds);
		for(Integer order:ordersList) {
			System.out.println(order.toString());
		}
	}

}
