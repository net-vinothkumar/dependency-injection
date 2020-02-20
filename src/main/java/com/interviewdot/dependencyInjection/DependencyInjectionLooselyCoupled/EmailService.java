package com.interviewdot.dependencyInjection.DependencyInjectionLooselyCoupled;

public class EmailService implements MessageService {
    @Override
    public void send(String user) {
        System.out.println("sent email to user..." + user);
    }
}
