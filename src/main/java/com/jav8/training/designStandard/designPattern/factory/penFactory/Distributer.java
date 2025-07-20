package com.jav8.training.designStandard.designPattern.factory.penFactory;

public class Distributer {

	public static PenFactory getPen(String product)
	{
		if (product.equalsIgnoreCase("pen"))
		return new PenDeveloper();
		
		return null;
		
	}
}
