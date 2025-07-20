package com.jav8.training.designStandard.loanDesignPatternWithLiskov;

public class TestLoanTransaction {
    public static void main(String[] args) {

        CreditCardLoanClosureService loanClosureService=new CreditCardLoanClosureService(new CreditCardLoan());
        loanClosureService.doPayment(1223);
        LoanPayment loanPayment=new CreditCardLoan();
        CreditCardLoan creditCardLoan= new CreditCardLoan();
        loanPayment.doPayment(1223);
        creditCardLoan.doPayment(1223);
        HomeLoanClosureService homeLoanClosureService=new HomeLoanClosureService(new HomeCardLoan());
        homeLoanClosureService.doPayment(2323);
        homeLoanClosureService.foreCloseLoan();


    }
}
