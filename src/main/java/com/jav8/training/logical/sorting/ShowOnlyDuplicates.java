package com.jav8.training.logical.sorting;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShowOnlyDuplicates {

	public static void main(String[] args) {
        List<String> names = List.of("java", "java", "spring", "spring", "spring", "developer"); // duplicate
        List<String> duplicateNames = names
                .stream()
                .filter(name -> Collections.frequency(names, name) > 1)
                .distinct()
                .collect(Collectors.toList());
 
        System.out.println(duplicateNames);
        
        System.out.println(CollectorsGroupingBy(List.of("java", "java", "spring", "spring", "spring", "developer")));
        System.out.println(CollectorsGroupingBy());
        System.out.println(CollectorsGroupingByMap());
        
	}

	static Map<String, Long> CollectorsGroupingByMap( ) {
		
		return List.of("java", "java", "spring", "spring", "spring", "developer").stream()
				.collect(Collectors.groupingBy(li -> li, Collectors.counting()))
				.entrySet()
		   .stream()
		   .filter( p -> p.getValue() > 1 )
		  
		   .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		 
	}
	static List<String> CollectorsGroupingBy( ) {
		
		return List.of("java", "java", "spring", "spring", "spring", "developer").stream()
				.collect(Collectors.groupingBy(li -> li, Collectors.counting()))
				.entrySet()
		   .stream()
		   .filter( p -> p.getValue() > 1 )
		   .map(m->m.getKey() ) 
		   .collect( Collectors.toList() );
		 
	}
	
	static Map<String, Long> CollectorsGroupingBy(List<String> lst) {		
		
		return lst.stream().collect(Collectors.groupingBy(li -> li, Collectors.counting()));
	}

}
