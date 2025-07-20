package com.jav8.training.designStandard.designPattern.adapterPattern.accountAdapterPattern;

public class AdapterDesignPatternTest {
	public static void main(String[] args) {

		StandardAccount sa = new StandardAccount(2000);
		System.out.println("Account Balance= " + sa.getBalance());
		
		
		PlatinumAccount pa = new PlatinumAccount(2000);
		System.out.println("Account Balance= " + pa.getBalance());		
		
		//Calling getBalance() on Adapter
		AccountAdapter adapter = new AccountAdapter(new OffshoreAccount(2000));
		System.out.println("Account Balance= " + adapter.getBalance());		
	}
}
