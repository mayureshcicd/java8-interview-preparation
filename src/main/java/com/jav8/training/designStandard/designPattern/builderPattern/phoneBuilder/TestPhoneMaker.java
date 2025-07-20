package com.jav8.training.designStandard.designPattern.builderPattern.phoneBuilder;


import static com.jav8.training.designStandard.designPattern.builderPattern.phoneBuilder.AbstractPhoneMaker.AbstracrtMaker.MyPhone;

public class TestPhoneMaker {

 
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Phone ph=new PhoneBuilder().setMake("abc").makePhone();
		System.out.println(ph.getMake());
		AbstractPhoneMaker.AbstracrtMaker.MyPhone.setMake("SD").setOs("Good");
		Phone ph2=MyPhone.makePhone();
		System.out.println(ph2.getMake());
		System.out.println(ph2.getOs());
	}

}
