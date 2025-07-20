package com.jav8.training.learn.markProcessor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentResult2 {



	public static void main(String[] args) {
		
		System.out.println("Starting");

		List<Student> students = List.of(
				new Student(1, "Ajyoti", List.of(new Marks("English", 80), new Marks("Algebra", 0))),
				new Student(2, "ram", List.of(new Marks("English", 88), new Marks("Algebra", 97))),
				new Student(2, "sita", List.of(new Marks("English", 60), new Marks("Algebra", 70))));
		
		
		List<Student> maxMarksList = students.stream()
						.max(Comparator.comparingInt(student -> {
							 	
							var totalMark=student.getMrk().stream().mapToInt(Marks::getScore).sum();
							student.setTotalMarks(totalMark);
							 
						 return student.getMrk().stream().mapToInt(mark -> mark.getScore()).sum();
							 
						
						
				}))
				.stream()
				.collect(Collectors.toList());
		System.out.println(maxMarksList);
		
		Student maxMarks =   students.stream()
				.max(Comparator.comparingInt(student -> student.getMrk().stream().mapToInt(mark -> mark.getScore()).sum())).get();
		
	 System.out.println(maxMarks);
	
	}

}
