package com.jav8.training.designStandard.genericBankDesignPattern.banks;

import com.jav8.training.designStandard.genericBankDesignPattern.bankFactory.Bank;

public class SBI extends Bank{

	public SBI() {}
	public void homeLoanInterestRate()
	{
		System.out.println("Current Home Loan Rate of Interest is 8.33");
	}
}
