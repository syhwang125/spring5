interface Promise{
	int add(int x, int y);
	void info();
}

class Calc implements Promise {
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public void info() {
		System.out.println("Calc info method");
		
	}
}

public class Chap19Interface {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.info();
		System.out.println(c.add(10, 3));

	}

}
