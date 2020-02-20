package com.interviewdot.dependencyInjection.DependencyInjectionLooselyCoupled;

public class SMSService implements MessageService {
    @Override
    public void processMessage(String user, String message) {
        System.out.println("sent SMS to user..." + user);
    }
}
