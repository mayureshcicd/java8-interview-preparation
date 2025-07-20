package com.jav8.training.designStandard.designPattern.factory.penFactory;

public class TestPenFactory {

	public static void main(String[] args) {
		PenFactory p=Distributer.getPen("pen");
		Pen pen=p.createPen("blue");
		pen.getPen();

	}

}
