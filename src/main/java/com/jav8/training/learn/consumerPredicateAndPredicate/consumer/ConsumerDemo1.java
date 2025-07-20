package com.jav8.training.learn.consumerPredicateAndPredicate.consumer;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {
		Consumer<Integer> c=(arg0)-> {
			System.out.println(arg0);			
		};
		c.accept(123);
	}


}
