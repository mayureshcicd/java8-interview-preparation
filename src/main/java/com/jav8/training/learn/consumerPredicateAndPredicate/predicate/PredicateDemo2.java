package com.jav8.training.learn.consumerPredicateAndPredicate.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo2 {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,2,3,4,5);
		 lst.stream().filter(arg0->arg0%2==0).forEach(arg0->{
			 System.out.println(arg0);		
		 });
	}


}
