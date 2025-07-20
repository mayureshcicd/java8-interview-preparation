package com.jav8.training.designStandard.designPattern.abstractFactory;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}