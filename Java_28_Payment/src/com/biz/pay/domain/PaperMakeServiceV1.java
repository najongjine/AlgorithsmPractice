package com.biz.pay.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PaperMakeServiceV1 {
	private PaperVO paperVO;
	private List<EmployVO> employVOList;
	String employeesNPaymentFile="src/com/biz/pay/exec/급여리스트.txt";
	
	public PaperMakeServiceV1() {
		super();
		// TODO Auto-generated constructor stub
		employVOList=new ArrayList<EmployVO>();
	}
	public PaperVO getPaperVO() {
		return paperVO;
	}

	public void setPaperVO(PaperVO paperVO) {
		this.paperVO = paperVO;
	}


	public List<EmployVO> getEmployVOList() {
		return employVOList;
	}
	public void setEmployVOList(List<EmployVO> employVOList) {
		this.employVOList = employVOList;
	}
	public String getEmployeesNPaymentFile() {
		return employeesNPaymentFile;
	}
	public void setEmployeesNPaymentFile(String employeesNPaymentFile) {
		this.employeesNPaymentFile = employeesNPaymentFile;
	}
	public void viewEmployeesAsList() {
		System.out.println("=====================================");
		for(EmployVO emVO:employVOList) {
			System.out.printf("사원번호:%s : 급여액:%d\n",emVO.getId(),emVO.getAmount());
		}
		System.out.println("------------------------------------------");
	}
	public void readFile() throws Exception {
		FileReader fw=new FileReader(employeesNPaymentFile);
		BufferedReader buffer=new BufferedReader(fw);
		
		while(true) {
			String reader=buffer.readLine();
			if(reader==null )break;
			if(reader.length()<1) continue;
			String[] _str=reader.split(":");
			EmployVO emVO=new EmployVO();
			emVO.setId(_str[0]);
			emVO.setAmount(Integer.valueOf(_str[1]));
			employVOList.add(emVO);
			
		}
		
		buffer.close();
		fw.close();
		System.out.println("employList size: "+employVOList.size());
	}
	public void make(){
		
		int sw=1;
		
		for(int i=0;i<employVOList.size();i++) {
			//List<PaperVO> pVOList=employVOList.get(i).getPaperVOList();
			//pVOList=new ArrayList<PaperVO>();
			int div=50000;
			int pay=employVOList.get(i).getAmount();
			for(; div>5 ;) {
				int count=pay/div;
				pay-=(count*div);
				String str=String.format("%d", div);
				//System.out.printf("%d 원권: %d\n", div,count);
				paperVO=new PaperVO();
				paperVO.setPaper(str);
				paperVO.setCount(count);
				//paperVOList.add(paperVO);
				employVOList.get(i).getPaperVOList().add(paperVO);
				
				if(sw>0) {
					div/=5;
				}else {
					div/=2;
				}
				sw*=-1;
			}
			System.out.printf("%s paperList: %d \n",employVOList.get(i).getId(),employVOList.get(i).getPaperVOList().size());
		}
		
	}//end
	public void viewPaperVOListSize(int index) {
		System.out.println(employVOList.get(index).getPaperVOList().size());
	}
}
