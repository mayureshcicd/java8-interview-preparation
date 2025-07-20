package com.jav8.training.designStandard.designPattern.factory.bagFactory;

public class BagDeveloper extends BagFactory {

	@Override
	public Bags createBag(String bagType) {
		if (bagType.equalsIgnoreCase("black"))
			return new BlackBag();
		else if (bagType.equalsIgnoreCase("blue"))
			return new BlueBag();
		else if (bagType.equalsIgnoreCase("red"))
			return new RedBag();
		return null;
	}

}
