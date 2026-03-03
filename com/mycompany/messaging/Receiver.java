package com.mycompany.messaging;

public class Receiver {
    public void receiveMessage(Message message) {   
        // Confirm receipt
        System.out.println("[CLIENT] The message has been received!");   
        
   
        System.out.println("[CLIENT] Processing message content: " + message.getContent());
        
        // Final completion
        System.out.println("[CLIENT] Message processing complete");
    }
}
