package com.jav8.training.designStandard.designPattern.abstractFactory;

public class ShapeFactory extends AbstractFactory {
	 

	@Override
	public Shape getShape(String shape) {
		
		if (shape.equals("Circle"))
			return new Circle();
		else if (shape.equals("Rectangle"))
			return new Rectangle();
		else if (shape.equals("Square"))
			return new Rectangle();
		return null;
	
	}

}
