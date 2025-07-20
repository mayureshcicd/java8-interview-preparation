package com.jav8.training.learn.consumerPredicateAndPredicate.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo3{

	public static void main(String[] args) {
		
		Supplier<String> c=()-> {
			return "This is Supplier";
		};
 
List<String> lst3=Arrays.asList();
String lst2=lst3.stream().findAny().orElseGet(c);
System.out.println(lst2);
	}
	 
}
