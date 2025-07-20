package com.jav8.training.learn.function.extendFunctionalInterface;

public interface Doable {
	 default void doIt(){  
	        System.out.println("Do it now");  
	    }  
}
