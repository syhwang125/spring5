// 람다식은 코드불럭을 메소드에 넣을때 사용하는 기술 
// 인터페이스와 익명클래스에 대한 이해가 필요함 
// Lambda expression , JDK1.8 
// 본 예제는 유튜브 중 깜따긔야 강좌 자바 기초 35강 람다식 내용을 기초로 작성


interface Say4 {
	int something(int a, int b);     // input param 있는 경우 
}

class Friend4 {
	public void greeting (Say4 line) {
		int num = line.something(3, 4);
		System.out.println("number is " + num);
	}
}


// 람다식 문법 (매개변수목록) -> {실행문} 

public class Chap35Lambda4 {

	public static void main(String[] args) {
		
		Friend4 rin = new Friend4();
		
		// 인터페이스와 익명 클래스 선언 
		rin.greeting(new Say4()  {
			@Override
			public int something(int a, int b) {
				System.out.println("hello~~~ ");
				System.out.println("This is annonymous class ~~~ ");
				System.out.println("input parameters are " + a + " , " + b);
				return 8;
			}
		});
		
		System.out.println("============================");
		// 람다 활용 
	
		rin.greeting ( (a,b) -> {
			System.out.println(" This  is Rin");
			System.out.println("Thank you Lambda > < " );
			System.out.println("input parameters are " + a + " , " + b);
			return 7;
		});
		

	}

}
