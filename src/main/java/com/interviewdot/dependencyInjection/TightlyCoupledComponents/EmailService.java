package com.interviewdot.dependencyInjection.TightlyCoupledComponents;

public class EmailService {

    public void send(String user) {
        System.out.println("sent email to user..." + user);
    }
}
