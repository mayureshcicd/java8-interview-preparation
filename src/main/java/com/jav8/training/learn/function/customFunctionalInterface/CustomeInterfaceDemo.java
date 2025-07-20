package com.jav8.training.learn.function.customFunctionalInterface;

public class CustomeInterfaceDemo {

	public static void main(String[] args) {
		String message= CustomInterface.lowerMessage("mayuresh");
		System.out.println(message);
		
		CustomInterface c=()->{System.out.println("Functional message ");};
		c.message();
		c.stringMessage();
		c.stringMessage("String demo");
		message= c.upperMessage("swami om");
		System.out.println(message);
		
	}

}
