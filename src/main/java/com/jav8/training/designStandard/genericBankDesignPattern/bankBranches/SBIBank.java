package com.jav8.training.designStandard.genericBankDesignPattern.bankBranches;

import com.jav8.training.designStandard.genericBankDesignPattern.bankFactory.Bank;
import com.jav8.training.designStandard.genericBankDesignPattern.banks.SBI;

//implements Bank.Bank_Interface<SBI>
public class SBIBank extends Bank<SBI> {
	private final static int DEPOSIT_AMT=1000;
	private final static int   WITHDRAWAL_AMT=600;
	private SBI sbi1 =super.getChildInstance(SBI.class);
	public SBIBank() {
		super(DEPOSIT_AMT,WITHDRAWAL_AMT);		
	}
	@Override
	public void depositAmt(int amt) {			
		super.depositAmt(amt);			 
	}	 
	@Override
	public void withDrwalAmt(int amt) {		
		super.withDrwalAmt(amt);		 
	}
/*	@Override
	public void homeLoanInterestRate(Class<SBI> o) {	
			SBI sbi=super.getInstance(o);
			sbi.homeLoanInterestRate();
	}*/
/*	@Override
	public void homeLoanInterestRate() {
		sbi.homeLoanInterestRate();
		
	}*/
   public void showsbiInfo()
   {
	   SBI sbi =super.getChild();
	   sbi.homeLoanInterestRate();
	   sbi1.homeLoanInterestRate();
   }
	 

 
 

}
