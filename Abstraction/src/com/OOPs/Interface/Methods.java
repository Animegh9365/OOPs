package com.OOPs.Interface;

public interface Methods {
	// Abstract methods
	void play();
	void stop();
	
	// Default methods
	default void pause() {
		System.out.println("Playback paused");
	}
	
	// Static methods
	static void resetAll() {
		System.out.println("All media has been reset to default settings.");
	}
}
