package com.jav8.training.learn.stream.ftmap;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jav8.training.learn.stream.module.Marks;
import com.jav8.training.learn.stream.module.Student;

public class StudentFlatMapDemo {

	public static void main(String[] args) {
		forEachDemo();
		flatmapStudentDemo();
		flatmapStudentDemoWithMethodReference();
	}

	static void forEachDemo() {
		getStudents().stream().forEach(emp -> {

			System.out.println(emp.getId() + " " + emp.getName());
		});
		System.out.println("------------------------------------------------------------");
	}

	static void flatmapStudentDemoWithMethodReference() {

		List<Student> result = getStudents().stream().flatMap(student -> {

			var totalMark = student.getMark().stream().mapToInt(Marks::getScore).sum();
			
			student.setTotalMarks(totalMark);
			return Stream.of(setGrade.apply(totalMark,student));
		}).collect(Collectors.toList());

		result.forEach(r->{
			System.out.println(r.getId()+" "+r.getName()+" "+r.getGrade()+" "+r.getMark()+" "+r.getTotalMarks());
			
		});
		System.out.println("------------------------------------------------------------");
	}

	static void flatmapStudentDemo() {

		List<Student> result = getStudents().stream().flatMap(student -> {

			var totalMark = student.getMark().stream().mapToInt(e->e.getScore()).sum();
			
			student.setTotalMarks(totalMark);
			
			return Stream.of(setGrade(student,totalMark));
		}).collect(Collectors.toList());

		result.forEach(r->{
			System.out.println(r.getId()+" "+r.getName()+" "+r.getGrade()+" "+r.getMark()+" "+r.getTotalMarks());
			
		});
		
		System.out.println("------------------------------------------------------------");
	}
	private static List<Student> getStudents() {
		return List.of(new Student(1, "Ajyoti", List.of(new Marks("English", 80), new Marks("Algebra", 0))),
				new Student(2, "ram", List.of(new Marks("English", 88), new Marks("Algebra", 97))),
				new Student(3, "sita", List.of(new Marks("English", 60), new Marks("Algebra", 70))));
	}
	static Student setGrade(Student student,int totalMark)
	{
		if (totalMark<=80)
			student.setGrade("C");
		if (totalMark>100 && totalMark<=130)
			student.setGrade("B");
		if (totalMark>130 && totalMark<=200)
			student.setGrade("A");
		return student;
	}
	static BiFunction<Integer, Student, Student> setGrade = (totalMark, student) -> {

		if (totalMark<=80)
			student.setGrade("C");
		if (totalMark>100 && totalMark<=130)
			student.setGrade("B");
		if (totalMark>130 && totalMark<=200)
			student.setGrade("A");
		return student;
	};
}
