
public class Chap14Param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		System.out.println(c.add(3,4));
	}

}

class Calculator {
		
		int add(int i, int j) {
			return i+j;
		}
}


