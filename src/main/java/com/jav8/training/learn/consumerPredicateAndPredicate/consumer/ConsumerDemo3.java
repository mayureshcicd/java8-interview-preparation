package com.jav8.training.learn.consumerPredicateAndPredicate.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo3 {

	public static void main(String[] args) {
		Consumer<Integer> c=(arg0)-> {
			System.out.println(arg0);			
		};
		List<Integer> lst=Arrays.asList(1,2,3,4,5);
		 lst.stream().forEach(c);
	}


}
