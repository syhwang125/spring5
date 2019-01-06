package lamdba;

public class RunnableTest {

	public static void main(String[] args) {
		System.out.println("=== Runnable Test ===");
		
		// Annonymous Runnable 
		Runnable r1 = new Runnable() {
			
			public void run() {
				System.out.println("hello world one!");
			}
		};
		
		// Rambda Runnable
		Runnable r2 = () -> System.out.println("hello rambda");
		
		r1.run();
		r2.run();
	}

}
