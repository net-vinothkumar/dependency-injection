package com.interviewdot.dependencyInjection.TightlyCoupledComponents;

public class SMSService {

    public void processMessage(String user){
        System.out.println("sent SMS to user..." + user);
    }
}
