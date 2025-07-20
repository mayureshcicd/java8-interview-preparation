package com.jav8.training.designStandard.loanDesignPatternWithLiskov;

public class CreditCardLoanClosureService {

    private LoanPayment loanPayment;

    public CreditCardLoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }


    public void doPayment(int amout) {
        loanPayment.doPayment(amout);
    }
}
