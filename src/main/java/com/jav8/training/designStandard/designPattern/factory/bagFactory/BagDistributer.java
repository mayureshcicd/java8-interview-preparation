package com.jav8.training.designStandard.designPattern.factory.bagFactory;

public class BagDistributer {

	public static BagFactory getBag(String bag)
	{
		return new BagDeveloper();
	}
}
