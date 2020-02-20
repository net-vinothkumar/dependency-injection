package com.interviewdot.dependencyInjection.DependencyInjectionLooselyCoupled;

public class MockMessageTestService implements MessageService {
    @Override
    public void send(String user) {
        System.out.println("unit testing - sent email to user..." + user);
    }
}
