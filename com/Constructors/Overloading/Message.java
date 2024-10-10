package com.Constructors.Overloading;

public class Message {
    // Constructor with no parameters
    public Message() {
        System.out.println("Default Message: Hello!");
    }

    // Constructor with one string parameter
    public Message(String msg) {
        System.out.println("Message: " + msg);
    }

    // Constructor with a string parameter and an integer
    public Message(String msg, int times) {
        System.out.println("Message: " + msg);
        System.out.println("Reminders: " + times);
    }
}
