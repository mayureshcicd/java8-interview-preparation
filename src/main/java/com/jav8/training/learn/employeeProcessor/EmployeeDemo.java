package com.jav8.training.learn.employeeProcessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

	
	public static void main(String[] args) {
		List<Employee> empl = new ArrayList<Employee>();
		empl.add(new Employee(1, "mayuresh",
				Arrays.asList(new Education(1, "10th", 1990), new Education(2, "11th", 1991),
						new Education(3, "12th", 1992), new Education(4, "fy", 1993), new Education(5, "sy", 1994),
						new Education(6, "ty", 1995)

				)));

		empl.add(new Employee(2, "Yogesh", Arrays.asList(new Education(1, "10th", 1990), new Education(2, "11th", 1991),
				new Education(3, "12th", 1992), new Education(4, "fy", 1993)

		)));

		List<Employee> employees = empl.stream().flatMap(employee ->
		{
			return 	employee.getEdu()
					.stream()
					.filter(education -> education.getYear() >= 1991)
					 .map(education -> new Employee(employee.getId(), employee.getName(),List.of(education))
						 ) ;
		}
		).collect(Collectors.toList());
		
		 
		employees.forEach(System.out::println);
	 
	 
		/*
		 * employees.forEach(e->{ System.out.println(e);
		 * 
		 * });;
		 */
	 

	}

}
