package com.OOPs.Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m1 = new Music();
		m1.play();
		m1.pause();
		m1.stop();
		
		// calling the resetAll() method using interface as it is a static method.
		Methods.resetAll();
	}

}
