package com.interviewdot.dependencyInjection.TightlyCoupledComponents;

public class MessageProcessor {

    public void processMessage(String user) {
        EmailService emailService = new EmailService();
        emailService.send(user);
    }
}
