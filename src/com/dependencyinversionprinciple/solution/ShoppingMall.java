package com.dependencyinversionprinciple.solution;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall( BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {

        BankCard bankCard = new CreditCard();       // here we need to change the Object here no
                                                                 // need to change the whole class  statements


        ShoppingMall shoppingMall = new ShoppingMall(bankCard);

        shoppingMall.doPurchaseSomething(5000);
    }
}
