package com.jav8.training.learn.function.functionFactory.chaining;

@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
	default Consumer<T> thenAccept (Consumer<T> method) {
		 return (T t) ->{
			 this.accept(t);
			 method.accept(t);
			 
		 };
	}
}
