package com.jav8.training.logical.findAge;

public class EmplolyeeDTO {

	private String name;
	private String address;
	private String dob;
	
	public EmplolyeeDTO() {
	}
	public EmplolyeeDTO(String name, String address, String dob) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "EmplolyeeDTO [name=" + name + ", address=" + address + ", dob=" + dob + "]";
	}
	
}
