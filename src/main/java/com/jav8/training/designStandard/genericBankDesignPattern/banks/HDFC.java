package com.jav8.training.designStandard.genericBankDesignPattern.banks;

import com.jav8.training.designStandard.genericBankDesignPattern.bankFactory.Bank;

public final class HDFC extends Bank{
		
	public HDFC(){}
	
	public void homeLoanInterestRate()
	{
		System.out.println("Current Home Loan Rate of Interest is 9.33");
	}
}