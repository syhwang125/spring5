package javapattern.singleton;

public class SingletonCounter {

	private static SingletonCounter singleton = new SingletonCounter();
	private int cnt = 0;
	
	private SingletonCounter() {
	}
	
	public static SingletonCounter getInstance() {
		return singleton;
	}
	
	public int getNextInt() {
		return ++cnt;
	}
}
