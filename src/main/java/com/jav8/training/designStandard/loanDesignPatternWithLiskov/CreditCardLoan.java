package com.jav8.training.designStandard.loanDesignPatternWithLiskov;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amout) {
        System.out.println(" Credit Payment "+amout);
    }
}
