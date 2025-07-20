package com.jav8.training.learn.consumerPredicateAndPredicate.consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo2 {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,2,3,4,5);
		 lst.stream().forEach(arg0->{
			 System.out.println(arg0);		
		 });
	}


}
