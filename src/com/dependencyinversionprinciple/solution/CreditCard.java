package com.dependencyinversionprinciple.solution;

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("payments using credit card");
    }
}
