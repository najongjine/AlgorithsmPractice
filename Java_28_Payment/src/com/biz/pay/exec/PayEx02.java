package com.biz.pay.exec;

import com.biz.pay.domain.PaperMakeServiceV1;
import com.biz.pay.domain.PaperWriterServiceV1;

public class PayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperMakeServiceV1 pms=new PaperMakeServiceV1();
		int pay=45466320;
		pms.make(pay);
		
		PaperWriterServiceV1 pws=new PaperWriterServiceV1();
		pws.setPaperVOList(pms.getPaperVOList());
		
		try {
			pws.wrtieToFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
