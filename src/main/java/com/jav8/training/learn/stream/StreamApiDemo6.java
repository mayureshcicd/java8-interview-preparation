package com.jav8.training.learn.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.jav8.training.learn.stream.dto.Employee;
import com.jav8.training.learn.stream.service.EmployeeService;

public class StreamApiDemo6 {

	public static void main(String[] args) {

		EmployeeService empService = new EmployeeService();

		List<Employee> empList = empService.getEmployeeList();
		 
		var assendingSortedList= empList.stream().sorted(Comparator.comparing(emp->emp.getName())).collect(Collectors.toList()); 
		System.out.println(assendingSortedList);
		
		
		var desSortedList= empList.stream().sorted(Comparator.comparing(emp->emp.getName())).collect(Collectors.toList()); 
		System.out.println(desSortedList);

	}

}
