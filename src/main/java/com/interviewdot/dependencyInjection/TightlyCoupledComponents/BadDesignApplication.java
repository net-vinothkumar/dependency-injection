package com.interviewdot.dependencyInjection.TightlyCoupledComponents;

public class BadDesignApplication {

    public static void main(String[] args) {
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.processMessage("Beno");
    }
}
