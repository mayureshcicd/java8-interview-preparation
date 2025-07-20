package com.jav8.training.logical.optional;

import com.jav8.training.interview.logical.Employee;

import java.util.Optional;

public class CheckAndSetValue {

	public static void main(String[] args) {
		 
		Employee updEmp=new Employee(1,null);
		
		Employee es=new Employee(1,"Previous Value");
		
		
		es.setId(updEmp.getId());
		
		getValue(es.getName()).ifPresent(d->{
			
			es.setName(d);
		});
		System.out.println(es);

	}
	static Optional<String> getValue(String value) {
		  return Optional.of(value); 
		}
}
