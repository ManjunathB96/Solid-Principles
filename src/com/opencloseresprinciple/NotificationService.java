package com.opencloseresprinciple;

public class NotificationService {
    //the open close principle states that acc to new requirement the module
    // should be open for extension(means : can extend & include fun) but
    // closed for modification(means: existing  code should not be altered or affected)


    public void sendOTP(String medium) {
        if (medium.equals("email")) {

        }
        if (medium.equals("mobile")) {

        }

    }
}


