package com.jav8.training.designStandard.bankDesignPattern.banks;


import com.jav8.training.designStandard.bankDesignPattern.bankBranches.HdfcBranch;
import com.jav8.training.designStandard.bankDesignPattern.bankFactory.Bank;

/*
 * Developed by Mayuresh Ratnaparkhi 01-June-2017
 * */
public class HDFCBank  extends Bank implements Bank.Bank_Interface<HdfcBranch>  {
	private final static int DEPOSIT_AMT=500;
	private final static int   WITHDRAWAL_AMT=500;
	private HdfcBranch hdfcBranch=super.getChild();
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
 	public void homeLoanInterestRate()
    {	  
		hdfcBranch.homeLoanInterestRate();		
    } 
}
