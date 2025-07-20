package com.jav8.training.learn.markProcessor;

import java.util.List;
import java.util.stream.Collectors;

public class StudentResult {



	public static void main(String[] args) {
		
		List<Student> students = List.of(
				new Student(1, "Ajyoti", List.of(new Marks("English", 80), new Marks("Algebra", 0))),
				new Student(2, "ram", List.of(new Marks("English", 88), new Marks("Algebra", 97))),
				new Student(2, "sita", List.of(new Marks("English", 60), new Marks("Algebra", 70))));
		
		 
		List<Student> result = students.stream().flatMap(student ->
		{
			 
			var totalMark=student.getMrk()
					.stream().mapToInt(Marks::getScore)
		            .sum();
			return 	student.getMrk()
					.stream()					
					 .map(education -> new Student(student.getId(), student.getName(),List.of(new Marks(education.getSubject(),education.getScore()
							 )))
						 ) ;
		}
		).collect(Collectors.toList());
		
		System.out.println(result);
		
		/*
		 * List<Student> topperStudentList = result.stream()
		 * .max(Comparator.comparingInt(l ->
		 * l.getMrk().stream().mapToInt(Marks::getScore).sum())).stream().collect(
		 * Collectors.toList());
		 * 
		 * System.out.println(topperStudentList);
		 * 
		 * 
		 * Student topperStudent = result.stream() .max(Comparator.comparingInt(student
		 * -> student.getMrk().stream().mapToInt(mark -> mark.getScore()).sum())).get();
		 * 
		 * System.out.println(topperStudent);
		 */
	}

}
