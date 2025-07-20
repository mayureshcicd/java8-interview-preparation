package com.jav8.training.learn.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jav8.training.learn.stream.dto.Employee;
import com.jav8.training.learn.stream.service.EmployeeService;

public class StreamApiDemo3 {

	public static void main(String[] args) {
		
		 EmployeeService empService=new EmployeeService();
		 
		 List<Employee> empList=empService.getEmployeeList();
		 Collections.sort(empList, new MyComparater());
		 System.out.println(empList);
		 
	}

}
class MyComparater implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return (int) (e1.getSalary()-e2.getSalary()); //assending
	}
	
}