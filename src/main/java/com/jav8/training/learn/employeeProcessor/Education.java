package com.jav8.training.learn.employeeProcessor;

public class Education {

	private int id;
	private String degree;
	private int year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Education(int id, String degree, int year) {
		super();
		this.id = id;
		this.degree = degree;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Education [id=" + id + ", degree=" + degree + ", year=" + year + "]";
	}
	
	
}
