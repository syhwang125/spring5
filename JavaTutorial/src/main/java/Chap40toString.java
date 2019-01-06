class People {
	private String name;
	
	public People(String name) {
		this.name = name;
	}
	
	public String toString() {
		//return "Hello > < b";
		return name;
	}
}

public class Chap40toString {

	public static void main(String[] args) {
		People p = new People("Rin");
		People p2 = new People("Rumina");
		System.out.println(p);
		System.out.println(p2);
	}

}
