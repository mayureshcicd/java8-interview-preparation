package com.jav8.training.designStandard.genericBankDesignPattern;

//import edu.banks.HDFC;

import com.jav8.training.designStandard.genericBankDesignPattern.bankBranches.HDFCBank;
import com.jav8.training.designStandard.genericBankDesignPattern.bankErrors.CustomError;

public class HDFCTest {
	public static void main(String[] args) {
		HDFCBank hDFCBank=new HDFCBank();
		try {
			hDFCBank.depositAmt(50);		
			hDFCBank.depositAmt(5892);		
			
		} catch (CustomError e) {
			System.out.println(e.getMessage());
		}
		hDFCBank.getDepositAmt();
		hDFCBank.getWithDrwalAmt();
		//hDFCBank.homeLoanInterestRate();
		//hDFCBank.homeLoanInterestRate(HDFC.class);
	}

}
