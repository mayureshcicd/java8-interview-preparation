package com.jav8.training.learn.function.functionFactory.chaining;

public class ChainingDemo {

	public static void main(String[] args) {
		Consumer<String> c1=s-> System.out.println(s);
		Consumer<String> c2=s-> System.out.println(s);
		
		Consumer<String> c3= s->{
			c1.accept("JAVA");
			c2.accept("SPRING BOOT");
		};
		c3.accept("FULL-STACK-DEVELOPER");
		Consumer<String> c4=c1.thenAccept(c2);
		c4.accept("end");
	};
	

}
