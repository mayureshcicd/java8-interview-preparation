package com.jav8.training.learn.consumerPredicateAndPredicate.predicate;

import java.util.function.Predicate;

public class PredicateDemo1  {

	public static void main(String[] args) {
		
		Predicate<Integer> c =(arg0)-> {
			if (arg0%2==0)
				return true;
			return false;
		};
		int val=12;
		System.out.println(String.valueOf(val).concat(" is even ").concat(String.valueOf(c.test(12))));

	}
	 

}
