package com.singleresponsibilityprinciple.bankservices;

public class BankServiceViolateSRP {

    //single responsibility principle states that " one class should have one and only one responsibility

    //this class violates SRP bcz it has multiple responsibilities i.e services

    //Note : when we need to change the state of loan services or Send OTP mtd then we need to modify other classes
    //it will affect  the whole  class

    //solution : create separate class for each services

    //Service : 1
    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withdraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }

    //service : 2
    public void printPasBook() {
        //update transaction info in passbook

    }


    //service : 3
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {

        }
        if (loanType.equals("personalLoan")) {

        }
        if (loanType.equals("carLoan")) {

        }
        //if bank want to increase loan services to people like gold loan ,bond loan we need to add the code and impl
    }

    //service : 4
    public void sendOTP(String medium) {
        if (medium.equals("email")) {

        }
    }
}
