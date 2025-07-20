package com.jav8.training.learn.collectionFlatMap;

import java.util.List;

public class User {

	private int id;
	private String name;
	private String dept;
	private double salary;
	private List<String> phone;
	public User(int id, String name, String dept, double salary, List<String> phone) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.phone = phone;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @return the phone
	 */
	public List<String> getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", phone=" + phone + "]";
	}
	 
	
}
