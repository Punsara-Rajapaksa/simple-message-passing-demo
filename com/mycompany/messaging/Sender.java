package com.mycompany.messaging;

public class Sender {
    public Message createMessage(String content) {
        // Start of action
        System.out.println("[CLIENT] Message is being created...");
        
        Message message = new Message(content);
        
        // End of action
        System.out.println("[CLIENT] Message has been created: " + message.getContent());
        return message;
    }
    
    public void sendMessage(Message message, Receiver receiver) {
        // Start of action
        System.out.println("[CLIENT] Message is being sent to the receiver");
        
        receiver.receiveMessage(message);
        
        // End of action
        System.out.println("[CLIENT] Message has been successfully sent to the receiver");
    }
}
