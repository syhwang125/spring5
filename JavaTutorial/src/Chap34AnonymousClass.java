

class Rin {
	public void greeting() {
		System.out.println("hi...");
	}
}

interface Utility {
	public void showInfo();
}
// 익명 클래스는 이름이 없는 클래스를 말함. 흔히 메소드를 오버라이드 하기 위해서 일회용으로 사용됨. 

public class Chap34AnonymousClass {

	public static void main(String[] args) {
		// Person rin = new Person();
		
		Rin rin = new Rin() {
			@Override
			public void greeting() {
				System.out.println("my name is Rin, nice to meet you .");
			}
		};
		
		rin.greeting();
		
		Utility util = new Utility() {

			@Override
			public void showInfo() {
				System.out.println("showing info .");
				
			}
			
		};
		util.showInfo();
	}

};


