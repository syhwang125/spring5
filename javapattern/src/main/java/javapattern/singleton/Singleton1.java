package javapattern.singleton;

public class Singleton1 {

	private static Singleton1 single = new Singleton1();
	public static Singleton1 getInstance() {
		return single;
	}
	
	private Singleton1() {
		
	}
	
	// 클래스 로드시 new가 실행이 됨. 항상 1개의 인스턴스를 가짐. 성능 좋음 
}
