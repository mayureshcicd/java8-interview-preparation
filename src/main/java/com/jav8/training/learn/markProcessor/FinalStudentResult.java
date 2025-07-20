package com.jav8.training.learn.markProcessor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FinalStudentResult {



	public static void main(String[] args) {
		
		System.out.println("Starting");

		List<Student> students = List.of(
				new Student(1, "Ajyoti", List.of(new Marks("English", 80), new Marks("Algebra", 0))),
				new Student(3, "shyam", List.of(new Marks("English", 88), new Marks("Algebra", 97))),
				new Student(2, "ram", List.of(new Marks("English", 88), new Marks("Algebra", 97))),
				new Student(4, "sita", List.of(new Marks("English", 60), new Marks("Algebra", 70))));
		
		List<Student> maxMarksList = students.stream()
				.max(Comparator.comparingInt(student -> {					
					student.setTotalMarks(student.getMrk().stream().mapToInt(Marks::getScore).sum());
					return student.getTotalMarks();
				
		}))
		.stream()
		.collect(Collectors.toList());
	 
		System.out.println(maxMarksList);
		
	
	
	}

}
