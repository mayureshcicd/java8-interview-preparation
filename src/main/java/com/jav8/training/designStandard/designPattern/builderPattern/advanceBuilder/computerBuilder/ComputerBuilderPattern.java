package com.jav8.training.designStandard.designPattern.builderPattern.advanceBuilder.computerBuilder;

public class ComputerBuilderPattern {

	public static void main(String[] args) {
		Computer comp = new Computer.Builder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
	}

}
