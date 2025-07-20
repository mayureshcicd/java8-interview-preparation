package com.jav8.training.learn.function.genericFunctionalInterface;


import com.jav8.training.learn.function.FunctionInterface;

public class FunctionInterFaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInterface<Long, Long> adder = new AddThree();
		Long result = adder.apply((long) 4);
		System.out.println("result = " + result);
	}

}
