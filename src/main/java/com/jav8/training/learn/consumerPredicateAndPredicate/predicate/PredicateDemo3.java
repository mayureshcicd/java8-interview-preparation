package com.jav8.training.learn.consumerPredicateAndPredicate.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {
		
		Predicate<Integer> c =(arg0)-> {
				return (arg0%2==0);
		};
		List<Integer> lst=Arrays.asList(1,2,3,4,5);
		 lst.stream().filter(c).forEach(arg0->{
			 System.out.println(arg0);		
		 });
	}


}
