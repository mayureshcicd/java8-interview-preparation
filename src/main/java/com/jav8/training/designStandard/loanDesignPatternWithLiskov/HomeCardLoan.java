package com.jav8.training.designStandard.loanDesignPatternWithLiskov;

public class HomeCardLoan implements SecureLoan{
    @Override
    public void doPayment(int amout) {
        System.out.println(" Home Payment "+amout);
    }

    @Override
    public void foreCloseLoan() {
        System.out.println(" Home Loan Closed ");
    }
}
