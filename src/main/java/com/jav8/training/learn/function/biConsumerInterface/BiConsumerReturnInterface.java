package com.jav8.training.learn.function.biConsumerInterface;
@FunctionalInterface
public interface BiConsumerReturnInterface <T, U> {
	  Long accept(T t, U u);
	}
