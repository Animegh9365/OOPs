package com.Constructors.simpleExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Laptop", 50000.00, "Electronics");
		Product p2 = new Product("Chair", 200.00, "Furniture");
		p1.displayProductDetails();
		p2.displayProductDetails();
	}

}
