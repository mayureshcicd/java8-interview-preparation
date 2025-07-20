package com.jav8.training.designStandard.loanDesignPatternWithLiskov;

public class HomeLoanClosureService {

    private SecureLoan secureLoan;


    public HomeLoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }
    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();

    }
    public void doPayment(int amout) {
        secureLoan.doPayment(amout);
    }
}
