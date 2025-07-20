package com.jav8.training.designStandard.genericBankDesignPattern.bankErrors;

public class CustomError extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public CustomError(String error) {		
		super( error);
	}
	
}
