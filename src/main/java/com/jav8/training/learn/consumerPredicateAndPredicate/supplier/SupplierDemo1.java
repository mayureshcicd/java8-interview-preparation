package com.jav8.training.learn.consumerPredicateAndPredicate.supplier;

import java.util.function.Supplier;

public class SupplierDemo1{

	public static void main(String[] args) {
		Supplier<String> c=()-> {
			return "This is Supplier";
		};
		System.out.println(String.valueOf(c.get()));

	}
	 
}
