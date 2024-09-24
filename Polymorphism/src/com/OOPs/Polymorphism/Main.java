package com.OOPs.Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		// Object creation of Room class
		Room myRoom = new Room();
		
		// accessing the static method below and passing the reference variable myRoom in the
		// parameter
		accessRoom(myRoom);

	}
	
	/*
	 * This is flexible code where the static method accessRoom is taking a parameter
	 * that is of Room type. This method accesses the methods of the Room class and executes 
	 * it one by one
	 * We can create this method in another class also and access it 
	 */
	public static void accessRoom(Room room) {
		room.book();
		room.checkIn();
		room.checkOut();
	}

}
