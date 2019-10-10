package com.biz.spy.service;

import com.biz.spy.ClothVO;

public class SpyServiceImp {
	private ClothVO currentClothVO;
	private ClothVO[] prevClothVO=new ClothVO[7];
	private int queIndex=0;
	private int maxQueSize;
	
	
	public SpyServiceImp() {
		super();
		// TODO Auto-generated constructor stub
		maxQueSize=prevClothVO.length;
	}

	public void wearNewCloth(ClothVO clothVO) {
		currentClothVO=new ClothVO();
		currentClothVO.generateRndCloth();
	}
	public void savePrevCloth(ClothVO clothVO) {
		int index=(queIndex++)%maxQueSize;
		prevClothVO[index]=clothVO;
	}
	public int checkIsDisguisGood() {
		int wasSameLevel=0;
		for(ClothVO clothVO: prevClothVO) {
			if(clothVO.getGlassesVO().getKind().equalsIgnoreCase(
					currentClothVO.getGlassesVO().getKind())) {
				wasSameLevel+=2;
			}
			if(clothVO.getGlassesVO().getColor().equalsIgnoreCase(
					currentClothVO.getGlassesVO().getColor())) {
				wasSameLevel+=1;
			}
			
			if(clothVO.getHatVO().getKind().equalsIgnoreCase(
					currentClothVO.getHatVO().getKind())) {
				wasSameLevel+=3;
			}
			if(clothVO.getHatVO().getColor().equalsIgnoreCase(
					currentClothVO.getHatVO().getColor())) {
				wasSameLevel+=1;
			}
			
			if(clothVO.getMakeupVO().getKind().equalsIgnoreCase(
					currentClothVO.getMakeupVO().getKind())) {
				wasSameLevel+=3;
			}
			
			if(clothVO.getPantsVO().getKind().equalsIgnoreCase(
					currentClothVO.getPantsVO().getKind())) {
				wasSameLevel+=3;
			}
			if(clothVO.getPantsVO().getColor().equalsIgnoreCase(
					currentClothVO.getPantsVO().getColor())) {
				wasSameLevel+=2;
			}
			
			if(clothVO.getShirtVO().getKind().equalsIgnoreCase(
					currentClothVO.getShirtVO().getKind())) {
				wasSameLevel+=3;
			}
			if(clothVO.getShirtVO().getColor().equalsIgnoreCase(
					currentClothVO.getShirtVO().getColor())) {
				wasSameLevel+=2;
			}
			
			if(clothVO.getShoesVO().getKind().equalsIgnoreCase(
					currentClothVO.getShoesVO().getKind())) {
				wasSameLevel+=1;
			}
			if(clothVO.getShoesVO().getColor().equalsIgnoreCase(
					currentClothVO.getShoesVO().getColor())) {
				wasSameLevel+=2;
			}
		}
		return wasSameLevel;
	}
}
