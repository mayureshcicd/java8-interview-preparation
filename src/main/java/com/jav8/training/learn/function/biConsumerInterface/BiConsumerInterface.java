package com.jav8.training.learn.function.biConsumerInterface;
@FunctionalInterface
public interface BiConsumerInterface <T, U> {
	  long accept(T t, U u);
	}
