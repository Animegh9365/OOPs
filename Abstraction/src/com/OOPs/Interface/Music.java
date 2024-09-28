package com.OOPs.Interface;

public class Music implements Methods {

	@Override
	public void play() {
		System.out.println("Music is playing.");
	}

	@Override
	public void stop() {
		System.out.println("Music is stopped.");
	}
	
	public void pause() {
		System.out.println("Music is paused.");
	}

}
