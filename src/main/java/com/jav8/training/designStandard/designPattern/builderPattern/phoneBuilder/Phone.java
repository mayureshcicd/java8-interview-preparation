package com.jav8.training.designStandard.designPattern.builderPattern.phoneBuilder;

public class Phone {

	 private  String versionId;
	 private  String Make;
	 private  String Os;
	 private String Price;

	 
	public String getVersionId() {
		return versionId;
	}
	public String getMake() {
		return Make;
	}	
	public String getOs() {
		return Os;
	}	
	
	public String getPrice() {
		return Price;
	}	
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public void setMake(String make) {
		Make = make;
	}

	public void setOs(String os) {
		Os = os;
	}

	public void setPrice(String price) {
		Price = price;
	}
	public Phone(String versionId, String make, String os, String price) {
		super();
		this.versionId = versionId;
		Make = make;
		Os = os;
		Price = price;
	}
	 
	 

}
