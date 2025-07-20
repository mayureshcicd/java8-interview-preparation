package com.jav8.training.learn.mapperInterface;

import java.util.Arrays;
import java.util.List;

public class TestBiFunctionAndFunction {

	public static void main(String[] args) {
	
		//"shrawan.dadarwal@simplifysynergy.com:Laptop@2022"
		System.out.println(MapperInterface.getbase64Token.apply("shrawan.dadarwal@simplifysynergy.com","Laptop@2022"));
		User user1 = new User();
		user1.setEmail("ek@gmail.com");
		user1.setId("id1");
		user1.setName("sekhar");
		
		var de=MapperInterface.getBiFunctionEmployeeMap.apply(user1, new Employee());
		System.out.println(de);
		var de1=MapperInterface.getFunctionEmployeeMap.apply(user1);
		System.out.println(de1);
		
		List<String> list1 = Arrays.asList("a", "b", "c");
		List<Integer> list2 = Arrays.asList(1, 2, 3);

		List<String> result = MapperInterface.listCombiner(list1, list2, (letter, number) -> letter + number);
		System.out.println(result);
		
		System.out.println(booleanList());
		 
	}
	static boolean firstIsGreaterThanSecond(Double a, Float b) {
	    return a > b;
	}
	static List<Boolean> booleanList()
	{
		List<Double> list1 = Arrays.asList(1.0d, 2.1d, 3.3d);
		List<Float> list2 = Arrays.asList(0.1f, 0.2f, 4f);

		return  MapperInterface.listCombiner(list1, list2, TestBiFunctionAndFunction::firstIsGreaterThanSecond);
	}
}
