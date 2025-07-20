package com.jav8.training.learn.consumerPredicateAndPredicate.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierDemo2{

	public static void main(String[] args) {
		
		List<String> lst=Arrays.asList("Swami","om","ganesh");
		Supplier<String> c=()-> {
			return "This is Supplier";
		};
		List<String> lst1=lst.stream().filter(arg0->arg0.equals("shree")==false).collect(Collectors.toList());
System.out.println(lst1);
List<String> lst3=Arrays.asList();
String lst2=lst3.stream().findAny().orElseGet(c);
System.out.println(lst2);
	}
	 
}
