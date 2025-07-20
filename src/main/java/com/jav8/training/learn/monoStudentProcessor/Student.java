package com.jav8.training.learn.monoStudentProcessor;

import java.util.List;

public class Student {
	private String name;
	private String grade;
	private List<String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public Student(String name, String grade, List<String> course) {
		super();
		this.name = name;
		this.grade = grade;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", course=" + course + "]";
	}
	
}
