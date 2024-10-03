package com.Constructors.simpleExample;

public class Product {
	String productName;
	double productPrice;
	String productCategory;
	
	/* Constructor to initialize the instance variables 
	   We use this keyword to specify the instance variable otherwise when same name is 
	   used in the parameter as that of instance variables then shadow problem may occur.
	   
	 */
	public Product(String productName, double productPrice, String productCategory) {
		//this.instanceVaribleName = parameterVariableName
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);
		System.out.println("Product Category: " + productCategory);
	}
}
