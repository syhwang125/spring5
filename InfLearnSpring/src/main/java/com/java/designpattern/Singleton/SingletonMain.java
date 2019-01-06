package com.java.designpattern.Singleton;

public class SingletonMain {

	// 인스턴스가 공유되므로 볼륨값이 변경되어도 동일하다. 
	public static void main(String[] args) {
		Speaker speaker1 = Speaker.getInstance();
		Speaker speaker2 = Speaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11);
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker2.setVolume(15);
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}

}
