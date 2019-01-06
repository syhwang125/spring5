// 람다식은 코드불럭을 메소드에 넣을때 사용하는 기술 
// 인터페이스와 익명클래스에 대한 이해가 필요함 
// Lambda expression , JDK1.8 
// 본 예제는 유튜브 중 깜따긔야 강좌 자바 기초 35강 람다식 내용을 기초로 작성


interface Say2 {
	int something();     // return 있는 경우 
}

class Friend2 {
	public void greeting (Say2 line) {
		line.something();
	}
}


// 람다식 문법 (매개변수목록) -> {실행문} 

public class Chap35Lambda2 {

	public static void main(String[] args) {
		
		Friend2 rin = new Friend2();
		
		// 인터페이스와 익명 클래스 선언 
		rin.greeting(new Say2() {
			@Override
			public int something() {
				System.out.println("hello~~~ ");
				System.out.println("This is annonymous class ~~~ ");
				return 8;
			}
		});
		
		System.out.println("============================");
		// 람다 활용 
	
		rin.greeting ( () -> {
			System.out.println(" This  is Rin");
			System.out.println("Thank you Lambda > < " );
			return 7;
		});
		

	}

}
