package com.biz.spy.domain.hat;

import java.util.Random;

public class HatVO {
	protected String kind;
	protected String color;
	protected final String partToWear="head";
	public final boolean bMustWear=false;
	
	protected final String[] kindsArray= { 
			"thick", "think", "round", "square", "small", "big","none"
	};
	protected final String[] colorsArray= {
		"pink","blue","black","blue","gray"	
	};
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPartToWear() {
		return partToWear;
	}
	public String[] getKindsArray() {
		return kindsArray;
	}
	public String[] getColorsArray() {
		return colorsArray;
	}
	public void makeRandomKind() {
		int kindArySize=kindsArray.length;
		Random rnd=new Random();
		int intIndex=rnd.nextInt(kindArySize);
		kind=kindsArray[intIndex];
	}
	public void makeRandomColor() {
		int colorArySize=colorsArray.length;
		Random rnd=new Random();
		int intIndex=rnd.nextInt(colorArySize);
		color=colorsArray[intIndex];
		if(kind.equalsIgnoreCase("none")) {
			setColor("none");
		}
	}//end
}
