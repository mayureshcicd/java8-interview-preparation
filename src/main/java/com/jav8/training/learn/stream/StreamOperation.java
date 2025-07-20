package com.jav8.training.learn.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
	static List<String> names = List.of("Jyoti", "Saksham", "Saksham", 
			"Adu", "Praful", "Praful", "Praful", "Java", "Java",
			"Java", "Spring", "Spring", "Spring", "Hibernate", "Practice");

	static List<Integer> lst = Arrays.asList(5,10,15, 20,25, 30, 35, 40,45, 50, 60,22,23,34,41,42);
	public static void main(String[] args) {
		 
		
		Stream<Integer> stream = Arrays.asList(10, 20, 30, 40, 50, 60).stream();
	    stream.filter( i -> i<23 )
	      .reduce( (a,b) -> b )
	      .ifPresent(System.out::println);
		findRange(10,50,lst);
		
		printList(names);
		
		printAssendingSortedList(names);
		
		printDessendingSortedList(names);
		
		printDistinctList(names);
		
		printCountList(names);
		
		printDuplicateList(names);
		
		printDuplicateCountMapList(names);
		
		printFilterList(names);
	}
	static void findRange(int min, int max,List<Integer> lst)
	{
		List<Integer> l = lst
		        .stream()
		        .filter(i -> i>min && i<max )
		        .sorted()
		        .collect(Collectors.toList());
		System.out.println("Range wise sorted numbers " +  l );
	}
	static void printList(List<String> names) {
		names.stream().forEach(name -> {

			System.out.println("Name " + name);
		});
		breakLine();
	}

	static void printAssendingSortedList(List<String> names) {
		names.stream().sorted().forEach(name -> {

			System.out.println("Name " + name);
		});
		breakLine();
	}

	static void printDessendingSortedList(List<String> names) {
		names.stream().sorted(Comparator.reverseOrder()).forEach(name -> {

			System.out.println("Name " + name);
		});
		breakLine();
	}

	static void printDistinctList(List<String> names) {
		names.stream().distinct().forEach(name -> {

			System.out.println("Name " + name);
		});
		breakLine();
	}
	static void printCountList(List<String> names) {
		System.out.println("Total elements  " + names.stream().count());
		breakLine();
	}
	
	static void printDuplicateList(List<String> names) {
		List<String> duplicateNames=names.stream()
				.filter(name->Collections.frequency(names, name)>1)
				 .distinct()
				.collect(Collectors.toList());
		System.out.println(" duplicate elements  " + duplicateNames);
		breakLine();
	}
	static void printFilterList(List<String> names) {
		List<String> duplicateNames=names.stream()
				.filter(name->name.startsWith("P"))
				.collect(Collectors.toList());
		System.out.println(" Filter elements  " + duplicateNames);
		breakLine();
	}
	static void printDuplicateCountMapList(List<String> names) {
		Map<String,Long> duplicateNames=names.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
				
		System.out.println(" duplicate elements and count  " + duplicateNames);
		breakLine();
	}
	static void breakLine() {
		System.out.println("------------------------------------------------------------------");
	}
}