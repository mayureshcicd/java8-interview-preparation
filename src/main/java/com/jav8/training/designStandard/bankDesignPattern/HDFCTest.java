package com.jav8.training.designStandard.bankDesignPattern;


import com.jav8.training.designStandard.bankDesignPattern.bankErrors.CustomError;
import com.jav8.training.designStandard.bankDesignPattern.banks.HDFCBank;

/*
 * Developed by Mayuresh Ratnaparkhi 01-June-2017
 * */
public class HDFCTest {
	public static void main(String[] args) {
		HDFCBank hDFCBank=new HDFCBank();
		try {
			hDFCBank.depositAmt(50);		
			hDFCBank.depositAmt(33358);	
			hDFCBank.getDepositAmt();
			hDFCBank.withDrwalAmt(8);
		} catch (CustomError e) {
			System.out.println(e.getMessage());
		}
		
		hDFCBank.getWithDrwalAmt();
		hDFCBank.homeLoanInterestRate();		 
	}

}
