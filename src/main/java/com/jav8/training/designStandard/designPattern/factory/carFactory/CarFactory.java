package com.jav8.training.designStandard.designPattern.factory.carFactory;

public abstract class CarFactory {
	protected String model;
	public abstract Car createCar(String carType);
	public String getModel() {
		return model;
	}
	
	
}
