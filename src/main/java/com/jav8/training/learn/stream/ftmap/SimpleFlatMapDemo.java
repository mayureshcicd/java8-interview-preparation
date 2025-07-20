package com.jav8.training.learn.stream.ftmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleFlatMapDemo {

	public static void main(String[] args) {
		showIntegerFlatMaps();
		showIntegerListOfListFlatMaps();
		showStringFlatMaps();

	}
	
	static void showIntegerFlatMaps()
	{
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
	  list1.stream().flatMap(no->{
			return Stream.of(no);
		}).collect(Collectors.toList()).forEach(n->{
			
			System.out.println(n);
		});
		
			
		 list1.stream().flatMap(no->{
			return Stream.of(no*2);
		}).collect(Collectors.toList()).forEach(n->{
			
			System.out.println(n);
		});
	}
	
	static void showIntegerListOfListFlatMaps()
	{
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		  
		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		 
		List<Integer> listOfAllIntegers = listOfLists.stream()
		          .flatMap(x -> x.stream())
		          .collect(Collectors.toList());

		System.out.println(listOfAllIntegers);
	}
	static void showStringFlatMaps()
	{
		List<String> list1 = Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");
	 
		 
		 list1.stream()
		          .flatMap(x -> Stream.of(x.toUpperCase()))
		          .collect(Collectors.toList()).forEach(n->{
		  			
		  			System.out.println(n);
		  		});
	}
	static void showStringListOfListFlatMaps()
	{
		List<String> list1 = Arrays.asList("One","Two","Three");
		List<String> list2 = Arrays.asList("Four","Five","Six","Seven");
		List<String> list3 = Arrays.asList("Eight","Nine","Ten");
		  
		List<List<String>> listOfLists = Arrays.asList(list1, list2, list3);
		 
		List<String> listOfAllIntegers = listOfLists.stream()
		          .flatMap(x -> x.stream())
		          .collect(Collectors.toList());

		System.out.println(listOfAllIntegers);
	}
}
