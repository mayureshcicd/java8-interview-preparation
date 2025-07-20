package com.jav8.training.learn.stream.module;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	private int id;
	private String name;
	private List<Marks> mark;
	private int totalMarks;
	public String grade;
	
	public Student(int id, String name, List<Marks> mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	 

 

}
