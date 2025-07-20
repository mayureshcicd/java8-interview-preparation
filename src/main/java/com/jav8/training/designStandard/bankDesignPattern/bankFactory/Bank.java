package com.jav8.training.designStandard.bankDesignPattern.bankFactory;
 
import com.jav8.training.designStandard.bankDesignPattern.bankErrors.CustomError;

/*
 * Developed by Mayuresh Ratnaparkhi 01-June-2017
 * */
public abstract class Bank extends GenericBank {

	private static int Amount;
	private static int depositLimit;
	private static int withdrwalLimit;
		   
	
	protected Bank(){}
	protected Bank(int depAmt,int withAmt) {
		super.loadInstance();		
		depositLimit=depAmt;
		withdrwalLimit=withAmt;
	}	
	 
	public void getDepositAmt()
	{
		System.out.println("Total Amount Deposited "+Amount);
	}
	
	public void getWithDrwalAmt()
	{
		System.out.println("Total Balanced Amount "+Amount);
	}
	
	protected void depositAmt(int amt)
	{		 
			if ((Amount+amt)>depositLimit)
			{					
				throw new CustomError("You can't deposit more than "+depositLimit+" in "+getClass().getSimpleName());					
			}
			 Amount+=amt;
		 
	}
	protected void withDrwalAmt(int amt)
	{			
		 	if ((Amount-amt)>withdrwalLimit)
			{					
				throw new CustomError("You can't withdrwal more than "+withdrwalLimit+" from "+getClass().getSimpleName());					
			}
		 	 
			Amount-=amt;	
	}	

	public interface Bank_Interface<T>{	}

	
}
