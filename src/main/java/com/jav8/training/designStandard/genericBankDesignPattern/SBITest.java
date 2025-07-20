package com.jav8.training.designStandard.genericBankDesignPattern;
import com.jav8.training.designStandard.genericBankDesignPattern.bankBranches.SBIBank;
import com.jav8.training.designStandard.genericBankDesignPattern.bankErrors.CustomError;
//import edu.banks.SBI;

public class SBITest {

	public static void main(String[] args) {
		SBIBank sBIBank=new SBIBank();
		try {
			sBIBank.depositAmt(50);
		//	sBIBank.depositAmt(50000);
		 				
		} catch (CustomError e) {
			System.out.println(e.getMessage());
		}
		sBIBank.showsbiInfo();
		/*Class<?> sbi=null;
		try {
			sbi=Class.forName("edu.banks.SBI");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			SBI sbi1=(SBI) sbi.newInstance();
			sbi1.homeLoanInterestRate();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	//	sBIBank.getDepositAmt();
		//sBIBank.getWithDrwalAmt();
		// 
		//sBIBank.homeLoanInterestRate(SBI.class);
		//sBIBank.homeLoanInterestRate();
	}
		
	 
}
