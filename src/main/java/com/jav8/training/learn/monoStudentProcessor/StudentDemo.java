package com.jav8.training.learn.monoStudentProcessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import reactor.core.publisher.Mono;

public class StudentDemo {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();

		  studentList.add(new Student("Robert","5st grade", Arrays.asList(new String[]{"history","math","geography"})));
		  studentList.add(new Student("Martin","8st grade", Arrays.asList(new String[]{"economics","biology"})));
		  studentList.add(new Student("Robert","9st grade", Arrays.asList(new String[]{"science","math"})));

		  Set<String> courses = studentList.stream().flatMap( e -> e.getCourse().stream()).collect(Collectors.toSet());

		  List<String> de=studentList.stream().flatMap(e->e.getCourse().stream().filter(ee->ee.contains("math"))).collect(Collectors.toList());
		 // System.out.println(de);
		  
		  List<Student> d=studentList.stream().filter(p->p.getName().equalsIgnoreCase("Martin") )
				  .collect(Collectors.toList());
		/*  System.out.println(d);
		  System.out.println(courses);
		  */
		 // System.out.println(showStudent(studentList));
		  System.out.println(showStudent(studentList).block());
		// var data=(List<Student>) showStudent(studentList);
		 //System.out.println("My data "+data);
		 List<Student> data1=(List<Student>) showStudent(studentList).block();
		// System.out.println("My data :----- "+data1);

	}

	static Mono<?> showStudent(List<Student> studentList)
	{
		return Mono.just(studentList).log().flatMap(stu->{
			return Mono.just(stu);
		});
	}
}
