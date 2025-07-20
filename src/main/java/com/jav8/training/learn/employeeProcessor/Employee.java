package com.jav8.training.learn.employeeProcessor;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<Education> edu;
	public Employee(int id, String name, List<Education> edu) {
		super();
		this.id = id;
		this.name = name;
		this.edu = edu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Education> getEdu() {
		return edu;
	}
	public void setEdu(List<Education> edu) {
		this.edu = edu;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", edu=" + edu + "]";
	}
	
}
