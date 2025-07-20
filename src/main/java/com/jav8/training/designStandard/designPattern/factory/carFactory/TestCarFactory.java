package com.jav8.training.designStandard.designPattern.factory.carFactory;

public class TestCarFactory {

	public static void main(String[] args) {
		CarFactory factory=CarShop.getCar();
		Car car=factory.createCar("red");
		System.out.println(factory.getModel());
		car.getCar();
	}

}
