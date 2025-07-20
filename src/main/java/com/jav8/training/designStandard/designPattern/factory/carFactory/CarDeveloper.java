package com.jav8.training.designStandard.designPattern.factory.carFactory;

public class CarDeveloper extends CarFactory {

	@Override
	public Car createCar(String carType) {
		if(carType.equalsIgnoreCase("black"))
		{
			super.model="Travel Car";
			return new BlackCar();
		}
		else if(carType.equalsIgnoreCase("blue"))
		{
			super.model="Private Car";
			return new BlueCar();
		}
		else if(carType.equalsIgnoreCase("red"))
		{
			super.model="Racing Car";
			return new RedCar();
		}
		return null;
	}

	
}
