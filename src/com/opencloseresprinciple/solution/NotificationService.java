package com.opencloseresprinciple.solution;

public interface NotificationService {
    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

    //  NotificationService interface is impl or extended any number of times but modification is not allowed

}
