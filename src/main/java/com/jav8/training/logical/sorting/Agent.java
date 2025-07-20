package com.jav8.training.logical.sorting;

public class Agent {

	private int id;
	private String name;
	private Double sal;
	 
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
	
	public Double getSal() {
		return sal;
	}
	
	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Agent(int id, String name, Double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
