package com.jav8.training.designStandard.designPattern.builderPattern.advanceBuilder.employeeBuilder;

public class Employee {
	private String name;
	private String address;
	private String email;
	private Boolean gender;
	private Double salary;
 
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
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public Boolean getGender() {
		return gender;
	}
	 
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	 
	public Double getSalary() {
		return salary;
	}
 
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(String name, String address, String email, Boolean gender, Double salary) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", email=" + email + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}
	public Employee() {
	}
	
	
	
}
