package com.inetrfacesegprinciple.solution2;

public interface UPIPaymentsInt {

    public void payMoney();

    public void getScratchCard();

    //to overcome the Interface Segregation Principle we created CashBackManager interface in that
    // public void getCashBackAsCreditBalance(); method is present


    // CashBackManager interface  parent class  is implemented  by child class such as  paytm and phonepay

}
