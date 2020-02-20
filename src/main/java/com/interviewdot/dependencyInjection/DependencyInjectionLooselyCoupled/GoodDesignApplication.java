package com.interviewdot.dependencyInjection.DependencyInjectionLooselyCoupled;

public class GoodDesignApplication {

    public static void main(String[] args) {
        MessageService messageService = new EmailService();

        //MessageService messageService = new SMSService();
        //MessageService messageService = new MockMessageTestService();

        MessageProcessor messageProcessor = new MessageProcessor(messageService);
        messageProcessor.processMessage("Beno");
    }
}
