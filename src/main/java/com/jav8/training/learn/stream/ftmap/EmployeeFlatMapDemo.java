package com.jav8.training.learn.stream.ftmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jav8.training.learn.stream.module.Employee;

public class EmployeeFlatMapDemo {

	public static void main(String[] args) {
		forEachDemo();
		flatmapDemo().forEach(emp -> {

			System.out.println(emp.getId() + " " + emp.getName());
		});

	}

	static void forEachDemo() {
		getEmployees().stream().forEach(emp -> {

			System.out.println(emp.getId() + " " + emp.getName());
		});
		System.out.println("------------------------------------------------------------");
	}

	static List<Employee> flatmapDemo() {
		return getEmployees().stream().flatMap(e -> {

			e.setName(e.getName().toUpperCase());
			return Stream.of(e);
		}).collect(Collectors.toList());
	}

	private static List<Employee> getEmployees() {
		return List.of(new Employee(1, "swami"), new Employee(2, "om"), new Employee(3, "shankar"),
				new Employee(4, "sai"), new Employee(5, "darbar"), new Employee(6, "Jai"), new Employee(7, "Ganesh"),
				new Employee(8, "aai"), new Employee(9, "Laxmi"), new Employee(10, "datta guru"),
				new Employee(9, "shree Ram"), new Employee(9, "Jai Hanuman"));
	}
}
