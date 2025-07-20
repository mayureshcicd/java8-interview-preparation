package com.jav8.training.designStandard.designPattern.builderPattern.phoneBuilder;

public class PhoneBuilder {
	 private  String versionId;
	 private  String Make;
	 private  String Os;
	 private String Price;
	public PhoneBuilder setVersionId(String versionId) {
		this.versionId = versionId;
		return this;
	}

	public PhoneBuilder setMake(String make) {
		Make = make;
		return this;
	}

	public PhoneBuilder setOs(String os) {
		Os = os;
		return this;
	}

	public PhoneBuilder setPrice(String price) {
		Price = price;
		return this;
	}
	public Phone makePhone()
	{
		return new Phone( versionId,  Make,  Os,  Price);
	}
	
}
