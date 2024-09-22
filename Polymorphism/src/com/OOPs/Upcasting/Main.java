package com.OOPs.Upcasting;

public class Main {

	public static void main(String[] args) {
		// Up-casting the child class to be assigned to the reference of parent class
		Vehicle v1 = new Car();
		// Accessing the method of child class
		v1.drive();
	}

}
