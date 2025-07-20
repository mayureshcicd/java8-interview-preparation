package com.jav8.training.designStandard.designPattern.abstractFactory;


public class TestAbstractFactory {
	
	public static void main(String[] args) {	 
		AbstractFactory factory=  FactoryProducer.getFactory("SHAPE");
		Shape shape1=factory.getShape("Circle");
		shape1.draw();
	}

}
