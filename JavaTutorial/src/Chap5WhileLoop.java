
public class Chap5WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		
		while (x < 5) {
			System.out.println("x의 값은 " + x + " 입니다.");
			x++;    //  x = x+1;
		}
		
		while (true) {
			System.out.println("x의 값은 " + x + " 입니다.");
			if(x==5) break;
		}
		
	}

}
