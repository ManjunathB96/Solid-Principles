package com.inetrfacesegprinciple;

public class Paytm implements UPIPayments{
    //paytm support only two features
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    //eventhough client not using this method we can not force the client
    // i.e paytm to override  this method by implementing upi payments
    //it violates the contract of interface segregation principles
    @Override
    public void getCashBackAsCreditBalance() {      //this feature not applicable to paytm

    }
}
