package com.jav8.training.designStandard.bankDesignPattern.bankBranches;


import com.jav8.training.designStandard.bankDesignPattern.bankFactory.Bank;

public final class HdfcBranch extends Bank {
		
	public void homeLoanInterestRate()
	{
		System.out.println("Current Home Loan Rate of Interest is 9.33");
	}
}