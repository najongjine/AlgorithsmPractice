package com.biz.spy.domain.makeup;

import java.util.Random;

public class MakeUPVO {
	protected String kind;
	//protected String color;
	protected final String partToWear="face";
	public final boolean bMustWear=true;
	
	protected final String[] kindsArray= { 
			"A", "B", "C", "D", "E", "F"
	};
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getPartToWear() {
		return partToWear;
	}
	public String[] getKindsArray() {
		return kindsArray;
	}
	public void makeRandomKind() {
		int kindArySize=kindsArray.length;
		Random rnd=new Random();
		int intIndex=rnd.nextInt(kindArySize);
		kind=kindsArray[intIndex];
	}//end
}
