// 재귀호출 Recursion
// 3! (3 factorial) = 3 * 2 *1 = 6
// 4! = 4 * 3 * 2* 1 = 24
// 0! = 1 
// 1! = 1
// n! = n * (n-1)! 
// 4! = 4 * 3! 
// 5! = 5 * 4! 



public class Chap41Recursion {

	public static int factorial (int num) {
		int fac = 1;
		for (int x = 1; x < num+1; x++) {
			fac = fac * x;
		}
		return fac;
		
	}
	
	public static void main(String[] args) {	
		System.out.println(factorial(3));
	}
	
	// 재귀호출을 사용한 방법 
	public static int fac (int num) {
		if(num <= 1) {
			return 1;
		} else {
			return num * fac(num-1);
		}
	}

}
