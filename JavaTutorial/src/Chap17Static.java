class Example {
	static String name = "Rin";
	
	String user = "Jane";
	
	static void showName() {
		System.out.println(name);
		// System.out.println(user);   static 변수가 아니므로 에
	}
}

public class Chap17Static {

	public static void main(String[] args) {
		
		// static variable, method 사용법 
		System.out.println(Example.name);	//객체화하지 않고 직접 호출 가능 
		
		Example.showName();
		
		// final 
		
		final int ID = 1;
		// ID = 2;		// final local variable 로 선언되어 있으므로 값을 변경할 수 없음. 
		
		//Math.PI = 1.9;     // Math.PI 는 final field 로 정의되어 있으므로 값을 변경할 수 없음 
		// Math class { public static final double PI = 3.141592; }
		
		System.out.println(Math.PI);
		
		
		
	}

}
