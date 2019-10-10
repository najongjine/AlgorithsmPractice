package com.biz.pay.domain;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class PaperWriterServiceV1 {
	private String file="src/com/biz/pay/exec/";
	private PaperVO paperVO;
	private List<EmployVO> employVOList;
	
	
	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}


	public List<EmployVO> getEmployVOList() {
		return employVOList;
	}


	public void setEmployVOList(List<EmployVO> employVOList) {
		this.employVOList = employVOList;
	}


	public PaperVO getPaperVO() {
		return paperVO;
	}


	public void setPaperVO(PaperVO paperVO) {
		this.paperVO = paperVO;
	}

	public void viewPaperVOListSize(int index) {
		System.out.println(employVOList.get(index).getPaperVOList().size());
	}
	public void wrtieToFile() throws Exception{
		
		
		for(EmployVO emVO: employVOList) {
			String empFile=file+emVO.getId();
			FileWriter fw=new FileWriter(empFile);
			PrintWriter printWriter=new PrintWriter(fw);
			
			printWriter.println(emVO.getId()+": "+emVO.getAmount());
			for(PaperVO pVO: emVO.getPaperVOList()) {
				String str=String.format("%s:%d", pVO.getPaper(),pVO.getCount());
				printWriter.println(str);
			}
			
			printWriter.flush();
			printWriter.close();
			fw.close();
		}
		
	}
}
