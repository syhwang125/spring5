package com.java.siljeon;

public class LamdaMain23 {

	public static void main(String[] args) {
		// 매개변수와 실행문만으로 작성한다 (접근자, 반환형, 리턴 리워드 생략
		LamdaInterface1 li1 = (String s1, String s2, String s3) -> {
			System.out.println(s1 + " " + s2 + " " + s3);
		};
		li1.method("hello", "java", "world");

		System.out.println();

		// 매개변수 1이거나 타입이 같을때 타입을 생략할 수 있다
		LamdaInterface li2 = (s1) -> {
			System.out.println(s1);
		};
		li2.method("Hello");
		System.out.println();

		// 실행문이 하나일때 {} 생략가능
		LamdaInterface li3 = (s1) -> System.out.println(s1);
		li3.method("Hello");
		System.out.println();

		// 매개변수와 실행문이 하나일때 (),{} 생략 가능
		LamdaInterface li4 = s1 -> System.out.println(s1);
		li4.method("Hello");
		System.out.println();

		// 매개변수가 없을때 ()만 작성
		LamdaInterface li5 = () -> System.out.println("no param");
		li5.method();

		System.out.println();

		// 반환값이 있는 경우
		LamdaInterface li6 = (x, y) -> {
			int result = x + y;
			return result;
		};

		System.out.printf("li6.method(10,20) : %d\n", li6.method(10, 20));
		System.out.println();

		li6 = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.printf("li6.method(10,20) : %d\n", li6.method(10, 20));
		System.out.println();

		li6 = (x, y) -> {
			int result = x - y;
			return result;
		};
		System.out.printf("li6.method(10,20) : %d\n", li6.method(10, 20));

		System.out.println();

		li6 = (x, y) -> {
			int result = x / y;
			return result;
		};
		System.out.printf("li6.method(20,10) : %d\n", li6.method(20, 10));
		System.out.println();

	}

}
