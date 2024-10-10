package com.Constructors.Overloading;

public class Main {

	public static void main(String[] args) {
		Message defaultMsg = new Message();  // Uses default constructor
        Message personalMsg = new Message("Hi, how are you?");  // Uses constructor with one parameter
        Message reminderMsg = new Message("Kindly pay bill", 3);  // Uses constructor with two parameters
        
        System.out.println(defaultMsg);
        System.out.println(personalMsg);
        System.out.println(reminderMsg);
	}

}
