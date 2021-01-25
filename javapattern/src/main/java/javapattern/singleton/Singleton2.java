package javapattern.singleton;

public class Singleton2 {

	private static Singleton2 single = new Singleton2();
	
	// 클래스 로드시에는 인스턴스가 생성되지 않음. getInstance()가 처음 호출될때 생성됨. 
	// 그러나 synchronized가 걸려있어 성능이 안 좋음 
	// 인스턴스를 사용할 필요가 없을때는 인스턴스가 생성되지 않는다는 점이 첫번째에 비해 장점임 
	public static synchronized Singleton2 getInstance() {   //synchronized 
		if (single == null) {
			single = new Singleton2();
		}
		return single;
	}
	
	private Singleton2() {
		
	}
}
