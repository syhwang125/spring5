package javapattern.singleton;

public class Singleton3 {

	private volatile static Singleton3 single ;  //volatile 변수의 원자성 보장 
	
	public static Singleton3 getInstance() {
		if (single == null) {       // 없다면 성능 저하 발생되며
			synchronized(Singleton3.class) {     // synchronized 
				if (single == null) {      // singleton 보장되지 않음 
					single = new Singleton3();
				}
			}
		}
		return single;
	}
	
	private Singleton3() {
		
	}
}
