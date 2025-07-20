package com.jav8.training.learn.function.biConsumerInterface;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceDemo {

	public static void main(String[] args) {
		 BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
	      addTwo.accept(1, 2);    // 3

	      BiConsumerInterface<Integer, Integer> addBiConsumerInterface = (x, y) ->  x + y;
	      System.out.println(addBiConsumerInterface.accept(1, 2));    // 3
	      
	      BiConsumerReturnInterface <Long, Long> returnBiConsumerInterface = (x, y) -> x + y;
	      System.out.println(returnBiConsumerInterface.accept((long)10, (long)10));
	}

}
