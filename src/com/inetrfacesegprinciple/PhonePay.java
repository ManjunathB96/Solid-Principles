package com.inetrfacesegprinciple;

public class PhonePay implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }


    //even though client not using getCashBackAsCreditBalance method we can not force the client
    // i.e phonepay to override  this method by implementing upi payments
    //it violates the contract of interface segregation principles
    @Override
    public void getCashBackAsCreditBalance() {
        //this feature not applicable to  phonepay
    }
}
