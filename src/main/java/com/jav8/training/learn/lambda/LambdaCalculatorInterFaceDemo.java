package com.jav8.training.learn.lambda;

public class LambdaCalculatorInterFaceDemo {

	public static void main(String[] args) {
		 
		Calcultor cal=(n1,n2,action)->{
			if (action.equals("+"))
			return n1+n2;
			if (action.equals("-"))
				return n1-n2;
			if (action.equals("*"))
				return n1*n2;
			if (action.equals("/"))
				return n1/n2;
			return null;
		};
		
		Integer result=(Integer) cal.calculation(5, 2, "+");
		System.out.println(result);
		
		 result=(Integer) cal.calculation(5, 2, "-");
			System.out.println(result);
		 result=(Integer) cal.calculation(5, 2, "*");
			System.out.println(result);
		 result=(Integer) cal.calculation(5, 2, "/");
			System.out.println(result);				
			
		 result=(Integer) cal.calculation(5, 2, "");
			System.out.println(result);			
			
	}

}
