package com.biz.runners.exec;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.biz.runners.service.UnfinishedRunnersService;

public class UnfinishedRunners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnfinishedRunnersService ufr=new UnfinishedRunnersService();
		
		String[] participants= {
			"aaa","bbb","aaa","ccc","aaa","bbb","qqq"	
		};
		String[] completion= {
				"aaa","bbb","aaa","ccc"
		};
		List<String> unFinishedRunners=ufr.solution(participants, completion);
		for(String s:unFinishedRunners) {
			System.out.println(s);
		}
	}

}
