package com.jav8.training.designStandard.loanDesignPatternWithLiskov;

public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
