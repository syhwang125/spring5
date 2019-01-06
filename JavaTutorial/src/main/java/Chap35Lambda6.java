// 람다식은 코드불럭을 메소드에 넣을때 사용하는 기술 
// 인터페이스와 익명클래스에 대한 이해가 필요함 
// Lambda expression , JDK1.8 
// 본 예제는 유튜브 중 깜따긔야 강좌 자바 기초 35강 람다식 내용을 기초로 작성

// ****** interface 안에 메소드가 1개만 있는 것을 functional interface 라고 함. 
// 람다식에서는 모두가 functional interface 이어야만 함. 
// 인터페이스 내에 메소드가 2개 이상인 경우 람다식에서 오류가 발생함 

@FunctionalInterface
interface Say6 {
	void something(int a, int b);     // input param 있는 경우 
}

@FunctionalInterface
interface Hello6 {
	void something(String a, String b);     // input param 있는 경우 
}

class Friend6 {
	public void greeting (Say6 line) {
		line.something(3, 4);
	}
	//overloading (매개변수만 다르게 함) 
	public void greeting (Hello6 line) {
		line.something("Hello", "World");
	}
}


// 람다식 문법 (매개변수목록) -> {실행문} 

public class Chap35Lambda6 {

	public static void main(String[] args) {
		
		Friend6 rin = new Friend6();
		
		// 인터페이스와 익명 클래스 선언 
		rin.greeting(new Say6()  {
			@Override
			public void something(int a, int b) {
				System.out.println("hello~~~ ");
				System.out.println("This is annonymous class ~~~ ");
			}
		});
		
		System.out.println("============================");
		// 람다 활용 
	
		// 매개변수의 타입을 명시적으로 해야하는 경우 
		
		rin.greeting ( (int a,int b) -> {
			System.out.println(" This  is Rin");
			System.out.println("Thank you Lambda > < " + a + " , " + b );
		});
		
		rin.greeting ( (String a,String b) -> {
			System.out.println(" This  is Rin");
			System.out.println("Thank you Lambda > < " + a + " , " + b);
		});

	}

}
