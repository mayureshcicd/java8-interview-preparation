package com.jav8.training.learn.markProcessor;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<Marks> mrk;
	private int totalMarks;
	public int getTotalMarks() {
		return totalMarks;
	}
	
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
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

	public List<Marks> getMrk() {
		return mrk;
	}

	public void setMrk(List<Marks> mrk) {
		this.mrk = mrk;
	}

	public Student(int id, String name, List<Marks> mrk) {
		super();
		this.id = id;
		this.name = name;
		this.mrk = mrk;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mrk=" + mrk + ", totalMarks=" + totalMarks + "]";
	}

 

}
