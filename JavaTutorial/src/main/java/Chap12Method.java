
public class Chap12Method {
	
		public static void main(String[] args) {
			Cat p1 = new Cat();
			p1.name = "냥이";
			p1.bloodType = "O";

			p1.speak();
		}
	}

class Cat {
		String name;
		String bloodType;
		
		void speak() {
			System.out.println("Cat's name is " + name + ", and bloodtype is " + bloodType);
		}
}

