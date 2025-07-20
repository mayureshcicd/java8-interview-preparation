package com.jav8.training.learn.function.functionFactory.factory;

public interface IConfigurator<T,R> {
	R configure( T t);
}
