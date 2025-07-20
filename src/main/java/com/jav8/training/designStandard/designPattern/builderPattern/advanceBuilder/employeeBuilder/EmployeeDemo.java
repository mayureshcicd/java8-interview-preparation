package com.jav8.training.designStandard.designPattern.builderPattern.advanceBuilder.employeeBuilder;

public class EmployeeDemo {

	public static void main(String ... s)
	{
		Employee emp=new Employee("name", "address", "email",true,  Double.valueOf(123) );

		System.out.println(emp.toString());
		
		Employee emps=new Employee();
		emps.setAddress("address");
		emps.setName("name");
		emps.setGender(false);
		emps.setSalary(Double.valueOf(3456.23));
		
		System.out.println(emps.toString());
		
	}
	
	
	
	
}
	