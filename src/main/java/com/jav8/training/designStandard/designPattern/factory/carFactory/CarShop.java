package com.jav8.training.designStandard.designPattern.factory.carFactory;

public class CarShop {

	public static CarFactory getCar()
	{
		return new CarDeveloper();
	}
	
}
