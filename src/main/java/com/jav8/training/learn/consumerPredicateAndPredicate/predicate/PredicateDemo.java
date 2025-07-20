package com.jav8.training.learn.consumerPredicateAndPredicate.predicate;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer>{

	public static void main(String[] args) {
		PredicateDemo c=new PredicateDemo();
		int val=12;
		System.out.println(String.valueOf(val).concat(" is even ").concat(String.valueOf(c.test(12))));

	}

	@Override
	public boolean test(Integer arg0) {
		if (arg0%2==0)
			return true;
		return false;
	}

	 

}
