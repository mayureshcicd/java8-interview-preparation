package com.jav8.training.designStandard.designPattern.adapterPattern.accountAdapterPattern;

public class PlatinumAccount extends AbstractAccount {

	public PlatinumAccount(final double balance) {
		super(balance);
		setOverdraftAvailable(true);
	}
}