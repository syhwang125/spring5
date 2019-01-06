package lamdba;

public class LambdaTest {

	public static void main(String[] args) {
		int result = add(3,6);
		System.out.println(result);
		
		
		// Annonymous Runnable 
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("R1 is Running....");
			}
		};
		
		
		// Rambda Runnable
		
		Runnable r2 = () -> {
			System.out.println("R2 is Running....");
		};
		
		r1.run();
		r2.run();
	}

	private static int add(int i, int j) {
		return i+j;
		
	}

}
