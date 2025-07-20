package com.jav8.training.designStandard.designPattern.adapterPattern.accountAdapterPattern;

public interface Account {
    public double getBalance();    
    public boolean isOverdraftAvailable();    
    public void credit(final double credit);
}
