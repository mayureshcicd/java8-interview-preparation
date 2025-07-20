package com.jav8.training.designStandard.bankDesignPattern;

import com.jav8.training.designStandard.bankDesignPattern.bankErrors.CustomError;
import com.jav8.training.designStandard.bankDesignPattern.banks.SBIBank;
/*
 * Developed by Mayuresh Ratnaparkhi 01-June-2017
 * */
public class SBITest {

	public static void main(String[] args) {
		SBIBank sBIBank=new SBIBank();
		try {
			sBIBank.depositAmt(50);
		 	sBIBank.depositAmt(5110);
		 				
		} catch (CustomError e) {
			System.out.println(e.getMessage());
		}		 
		sBIBank.getDepositAmt();
		sBIBank.getWithDrwalAmt();	 
		sBIBank.homeLoanInterestRate();
	}
		
	 
}
