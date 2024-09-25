package com.OOPs.Abstraction;

public class Car extends Vehicle {
	
	// If we don't implement the methods of the abstract class to the subclass that is inheriting
	// it will show error so it is mandatory to use the abstract methods of the abstract class
	public void run() {
		System.out.println("Car is running on the road");
	}
}
