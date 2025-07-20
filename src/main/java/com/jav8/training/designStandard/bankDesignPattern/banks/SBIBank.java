package com.jav8.training.designStandard.bankDesignPattern.banks;

import com.jav8.training.designStandard.bankDesignPattern.bankBranches.SbiBranch;
import com.jav8.training.designStandard.bankDesignPattern.bankFactory.Bank;

/*
 * Developed by Mayuresh Ratnaparkhi 01-June-2017
 * */
public class SBIBank extends Bank implements Bank.Bank_Interface<SbiBranch>  {
	private final static int DEPOSIT_AMT=1000;
	private final static int   WITHDRAWAL_AMT=600;
	private SbiBranch sbiBranch =super.getChild();
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
	public void homeLoanInterestRate()
    {	  
	   sbiBranch.homeLoanInterestRate();	   
    }
	 

 
 

}
