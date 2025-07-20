package com.jav8.training.designStandard.designPattern.factory.bagFactory;

public class TestBagFactory {

	public static void main(String[] args) {
		 
		BagFactory factory= BagDistributer.getBag("bag");
		Bags bag=factory.createBag("Black");
		bag.getBag();
	}

}
