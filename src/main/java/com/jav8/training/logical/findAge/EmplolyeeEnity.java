package com.jav8.training.logical.findAge;

public class EmplolyeeEnity {

	private String name;
	private String address;
	private String dob;
	private String age;
	
	public EmplolyeeEnity() {
	}
	public EmplolyeeEnity(String name, String address, String dob,String age) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.age=age;
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
		return "EmplolyeeEnity [name=" + name + ", address=" + address + ", dob=" + dob + ", age=" + age + "]";
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
