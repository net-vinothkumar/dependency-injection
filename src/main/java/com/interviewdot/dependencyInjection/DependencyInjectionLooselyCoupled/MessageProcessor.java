package com.interviewdot.dependencyInjection.DependencyInjectionLooselyCoupled;

public class MessageProcessor {

    private MessageService messageService;

    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String user) {
        this.messageService.send(user);
    }
}
