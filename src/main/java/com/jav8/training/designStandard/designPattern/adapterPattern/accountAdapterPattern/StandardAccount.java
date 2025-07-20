package com.jav8.training.designStandard.designPattern.adapterPattern.accountAdapterPattern;

public class StandardAccount extends AbstractAccount {

	public StandardAccount(final double balance) {
		super(balance);
		setOverdraftAvailable(false);
	}
}