package com.jav8.training.learn.consumerPredicateAndPredicate.supplier;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String>{

	public static void main(String[] args) {
		SupplierDemo c=new SupplierDemo();
		System.out.println(String.valueOf(c.get()));

	}

	@Override
	public String get() {
		return "This is Supplier";
	}

}
