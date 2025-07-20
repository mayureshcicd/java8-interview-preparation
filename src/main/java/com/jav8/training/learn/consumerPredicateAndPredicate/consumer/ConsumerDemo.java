package com.jav8.training.learn.consumerPredicateAndPredicate.consumer;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer>{

	public static void main(String[] args) {
		ConsumerDemo c=new ConsumerDemo();
		c.accept(123);

	}

	@Override
	public void accept(Integer arg0) {
		System.out.println(arg0);
		
	}

}
