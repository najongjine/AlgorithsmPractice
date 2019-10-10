package com.biz.spy;

import com.biz.spy.domain.glasses.GlassesVO;
import com.biz.spy.domain.hat.HatVO;
import com.biz.spy.domain.makeup.MakeUPVO;
import com.biz.spy.domain.pants.PantsVO;
import com.biz.spy.domain.shirt.ShirtVO;
import com.biz.spy.domain.shoes.ShoesVO;

public class ClothVO {
	//모자
	HatVO hatVO;
	//안경
	GlassesVO glassesVO;
	//셔츠
	ShirtVO shirtVO;
	//바지
	PantsVO pantsVO;
	//신발
	ShoesVO shoesVO;
	MakeUPVO makeupVO;
	
	public ClothVO() {
		super();
		// TODO Auto-generated constructor stub
		glassesVO=new GlassesVO();
		hatVO=new HatVO();
		shirtVO=new ShirtVO();
		pantsVO=new PantsVO();
		shoesVO=new ShoesVO();
		makeupVO=new MakeUPVO();
	}
	public GlassesVO getGlasses() {
		return glassesVO;
	}
	public void setGlasses(GlassesVO glasses) {
		this.glassesVO = glasses;
	}
	public HatVO getHatVO() {
		return hatVO;
	}
	public void setHatVO(HatVO hatVO) {
		this.hatVO = hatVO;
	}
	public GlassesVO getGlassesVO() {
		return glassesVO;
	}
	public void setGlassesVO(GlassesVO glassesVO) {
		this.glassesVO = glassesVO;
	}
	public ShirtVO getShirtVO() {
		return shirtVO;
	}
	public void setShirtVO(ShirtVO shirtVO) {
		this.shirtVO = shirtVO;
	}
	public PantsVO getPantsVO() {
		return pantsVO;
	}
	public void setPantsVO(PantsVO pantsVO) {
		this.pantsVO = pantsVO;
	}
	public ShoesVO getShoesVO() {
		return shoesVO;
	}
	public void setShoesVO(ShoesVO shoesVO) {
		this.shoesVO = shoesVO;
	}
	public MakeUPVO getMakeupVO() {
		return makeupVO;
	}
	public void setMakeupVO(MakeUPVO makeupVO) {
		this.makeupVO = makeupVO;
	}
	public void generateRndCloth() {
		glassesVO.makeRandomColor();
		glassesVO.makeRandomKind();
		//System.out.println(glasses.getKind()+"\t"+glasses.getColor());

		hatVO.makeRandomKind();
		hatVO.makeRandomColor();
		
		makeupVO.makeRandomKind();
		
		pantsVO.makeRandomKind();
		pantsVO.makeRandomColor();
		
		shirtVO.makeRandomKind();
		shirtVO.makeRandomColor();
		
		shoesVO.makeRandomKind();
		shoesVO.makeRandomColor();
		
	}
}
