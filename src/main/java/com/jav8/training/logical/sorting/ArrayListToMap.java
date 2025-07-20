package com.jav8.training.logical.sorting;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListToMap {

	public static void main(String[] args) {
		ArrayListToMap el = new ArrayListToMap();

		List<Employee> empList = List.of(el.new Employee(1, "A"), el.new Employee(2, "b"), el.new Employee(3, "c"));
		Map<Integer, String> result = empList.stream().collect(Collectors.toMap(x -> x.getEid(), x -> x.getName()));
		 System.out.println("Result 3 : " + result);
	}

	class Employee {
		private int eid;
		private String name;

		public Employee(int eid, String name) {
			this.eid = eid;
			this.name = name;
		}

		public int getEid() {
			return eid;
		}

		public String getName() {
			return name;
		}

	}
}
