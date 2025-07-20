package com.jav8.training.designStandard.genericBankDesignPattern.bankBranches;

import com.jav8.training.designStandard.genericBankDesignPattern.bankFactory.Bank;
import com.jav8.training.designStandard.genericBankDesignPattern.banks.HDFC;

//implements Bank.Bank_Interface<HDFC>
public class HDFCBank  extends Bank<HDFC> {
	private final static int DEPOSIT_AMT=500;
	private final static int   WITHDRAWAL_AMT=500;
	//private HDFC hdfc=super.getChildInstance(HDFC.class); 
	public HDFCBank() {
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
	public void homeLoanInterestRate(Class<HDFC> o) {
		HDFC hdfc=super.getInstance(o);
		hdfc.homeLoanInterestRate();		
	}*/
	/*@Override
	public void homeLoanInterestRate() {
		hdfc.homeLoanInterestRate();		
		
	}*/
	
	
	 
	
}
