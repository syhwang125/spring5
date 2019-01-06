package com.java.designpattern.Singleton;

public class Speaker {

	private static Speaker instance;
	
	private int volume;
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return this.volume;
	}

	private Speaker() {
		volume = 5;
	}
	
	public static Speaker getInstance(){
		if (instance == null) {
			instance = new Speaker();
		}
		return instance;
	}
	
	
}
