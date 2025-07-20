package com.jav8.training.designStandard.genericBankDesignPattern.bankFactory;

 
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.jav8.training.designStandard.genericBankDesignPattern.bankErrors.CustomError;

public abstract class Bank<T> {

	private static int Amount;
	private static int depositLimit;
	private static int withdrwalLimit;
	private T o = null;	
	 
	 private Class<?> t=null;
	   
	
	public Bank(){
		
	}
	public Bank(int depAmt,int withAmt) {
		Type t = this.getClass().getGenericSuperclass();		    
		ParameterizedType p = (ParameterizedType)t;			  
        try {
			this.t =  Class.forName(p.getActualTypeArguments()[0].getTypeName());
		} catch (ClassNotFoundException e) {				 
			e.printStackTrace();
		}
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
		 	if ((Amount-amt)<=withdrwalLimit)
			{					
				throw new CustomError("You can't withdrwal more than "+withdrwalLimit+" from "+getClass().getSimpleName());					
			}
			Amount-=amt;
		 			
		
	}	

	@SuppressWarnings({ "hiding", "unchecked" })
	protected <T> T getChild()
	{		 
		
		T o = null;
		try {
			if (o==null)
			{ 
				synchronized (this) {
					o=  (T) t.newInstance() ;
				}
			}
			 
		} catch (Exception e) {}
		return o;
		
		
	 
		 
	}
	protected <T> T getChildInstance(Class<T> obj)
	{
		T o = null;
		try {
			if (o==null)
			{
				synchronized (this) {
					o=obj.newInstance();
				}
			}
			 
		} catch (Exception e) {}
		return o;
		
	} 

	public interface Bank_Interface<T>{
		 
		 
		//public void homeLoanInterestRate(Class<T> o) ;
		public void homeLoanInterestRate();
	}

	
}
