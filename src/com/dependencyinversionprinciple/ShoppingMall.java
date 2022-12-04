package com.dependencyinversionprinciple;

public class ShoppingMall {
    /*the dependency inversion principle asserts that rather than real implementations,
    we should rely on abstractions(interfaces and abstract classes or classes )

    details should not be dependent  on abstractions ; rather abstraction should be dependent on details
      */
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard){
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {

        DebitCard card = new DebitCard();

        ShoppingMall shoppingMall = new ShoppingMall(card);

        shoppingMall.doPurchaseSomething(5000);
    }
}

/*

// if our debit card is not working we need to use the credit card in that condition

// the  above class ShoppingMall  is tightly coupled with  debit card

//to change the payment mode we need to change the bunch of code
public class ShoppingMall2 {
    private DebitCard debitCard;

    private CreditCard creditCard;

    public ShoppingMall2(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    public void doPurchaseSomething(long amount){
        creditCard.doTransaction(amount);
    }

    public static void main(String[] args) {            //it is not a good practice

        DebitCard card = new DebitCard();

        CreditCard card1 = new CreditCard();

        ShoppingMall2 shoppingMall = new ShoppingMall2(card1);   //bcz of tight coupling each time obj ref is created

        shoppingMall.doPurchaseSomething(60000);
    }
}
*/