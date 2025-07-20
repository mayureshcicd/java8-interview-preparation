package com.jav8.training.interview.findHighestSalary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindHighestSalaryOfEmployee {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"Mayuresh",25000.00));
        list.add(new Employee(1,"Ashutosh",95000.00));
        list.add(new Employee(1,"Yash",75000.00));
        Employee employee= list.stream().max(Comparator.comparingDouble(emp->emp.getSalary())).orElse(null);
       System.out.println(employee.toString());

        list.stream().min(Comparator.comparingDouble(Employee::getSalary)).ifPresent(emp->{
            System.out.println(emp.toString());

        });
    }
}
