package javapattern.singleton;

public class SingletonApp {

	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		// 6, 6
		System.out.println(speaker1.getVolumn());
		System.out.println(speaker2.getVolumn());
		
		speaker1.setVolumn(8);
		
		// speaker1, 2 모두 동일한 주소값을 갖음 
		// speaker2 javapattern.singleton.SystemSpeaker@2812cbfa
		// speaker1 javapattern.singleton.SystemSpeaker@2812cbfa
		
		// 8, 8
		System.out.println(speaker1.getVolumn());
		System.out.println(speaker2.getVolumn());

		SystemSpeaker speaker3 = SystemSpeaker.getInstance();
		
		speaker2.setVolumn(10);
		
		// 10, 10
		System.out.println(speaker1.getVolumn());
		System.out.println(speaker2.getVolumn());
	}

}
