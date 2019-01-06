
public class Chap7Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Jane";
		
		switch(name) {
			case "Rin" : 
				System.out.println("My Name is " + name);
				break;
			case "Jane":
				System.out.println("My friend's name is " + name);
				break;
			default:
				System.out.println("default name  is " + name);
		}
	}

}
