package com.jav8.training.learn.lambda;

public class LambdaFunctionDemo {
	public interface MyFunctionalInterface {
	    public void execute();
	}
	public static void main(String[] args) {
		MyFunctionalInterface lambda = () -> {
		    System.out.println("Executing...");
		};
		
		lambda.execute();
	}

}
