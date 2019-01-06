
public class Chap24Casting {

	public static void main(String[] args) {
		short shortNum = 123;
		int intNum = 12345;
		long longNum = 123456789L;
		long longNum2 = 1234567890000000L;
		float floatNum = 1.234f;
		double doubleNum = 0.123456789; 
		
		int num1 = (int)longNum;
		int num2 = (int)longNum2;	//너무 큰 숫자를 캐스팅하면 음수 등 이상한 값을 출력함.
		
		System.out.println("long -> int : " + num1);
		System.out.println("long -> int : " + num2);
		
		String s = Integer.toString(num1);
		System.out.println("int -> string : " + s);
	}

}
