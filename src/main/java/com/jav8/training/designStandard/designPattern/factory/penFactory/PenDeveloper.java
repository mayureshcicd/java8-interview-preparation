package com.jav8.training.designStandard.designPattern.factory.penFactory;

public class PenDeveloper extends PenFactory {

	@Override
	public	Pen createPen(String penType) {
		if (penType.equalsIgnoreCase("blue"))
			return new BluePen();
		else if (penType.equalsIgnoreCase("red"))
			return new RedPen();
		else if (penType.equalsIgnoreCase("black"))
			return new BlackPen();
		return null;
	}

}
