package com.jav8.training.learn.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.jav8.training.learn.stream.dto.Employee;
import com.jav8.training.learn.stream.service.EmployeeService;

public class StreamApiDemo5 {

	public static void main(String[] args) {

		EmployeeService empService = new EmployeeService();

		List<Employee> empList = empService.getEmployeeList();
		Collections.sort(empList, (e1, e2) -> {
			return (int) (e2.getSalary() - e1.getSalary()); // descanding);

		});

		System.out.println(empList);

		var sortedList = empList.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(sortedList);

	}

}
