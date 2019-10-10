package com.biz.pay.exec;

import com.biz.pay.domain.PaperMakeServiceV1;
import com.biz.pay.domain.PaperWriterServiceV1;

public class EmployPayEx01 {
	public static void main(String[] args) {
		PaperMakeServiceV1 pms=new PaperMakeServiceV1();
		try {
			pms.readFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pms.make();
		
		PaperWriterServiceV1 pws=new PaperWriterServiceV1();
		pws.setEmployVOList(pms.getEmployVOList());
		try {
			pws.wrtieToFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end main
}
