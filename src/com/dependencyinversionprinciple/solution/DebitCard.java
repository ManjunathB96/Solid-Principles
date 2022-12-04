package com.dependencyinversionprinciple.solution;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("payments using debit card");
    }
}
