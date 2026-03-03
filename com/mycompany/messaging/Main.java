package com.mycompany.messaging;

public class Main {
    public static void main(String[] args) {
        System.out.println("[SYSTEM] Initializing Sender and Receiver...");

        // Create instances
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        System.out.println("[SYSTEM] Starting communication process...");

        // Create and Send
        Message message = sender.createMessage("This is the message");
        sender.sendMessage(message, receiver);

        System.out.println("[SYSTEM] Process finished successfully");
    }
}
