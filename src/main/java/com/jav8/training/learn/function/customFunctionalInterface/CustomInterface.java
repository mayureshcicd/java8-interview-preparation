package com.jav8.training.learn.function.customFunctionalInterface;

@FunctionalInterface
public interface CustomInterface {
	void message();
	default void stringMessage() {
		System.out.println("This is default String message");
	};
	
	default void stringMessage(String message) {
		System.out.println("This is default String message ".concat(message));
	};	
	
	default String upperMessage(String message) {
		return message.toUpperCase();
	};
	
	static String lowerMessage(String message) {
		return message.toLowerCase();
	};
}
