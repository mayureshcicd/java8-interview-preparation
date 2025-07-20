package com.jav8.training.learn.stream.service;

import java.util.ArrayList;
import java.util.List;

import com.jav8.training.learn.stream.dto.Employee;
import java.util.Random;
public class EmployeeService {

	public List<Employee> getEmployeeList()
	{
		Random rd = new Random();
		List<Employee> empList=new ArrayList<Employee>();
		for (int i=0;i<10;i++)
		{
			empList.add(new Employee(i, "name"+i, "dept"+i, Long.valueOf(String.valueOf(rd.nextLong()))));
		}
		return empList;
	}
}
