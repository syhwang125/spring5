package industry;

public class Monster {
	private String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	// private 대신 static, public 으로 변경 가능 
	private class Brain {
		public void think() {
			System.out.println(name + " is thinking...");
		}
	}

	public void spawn() {
		Brain brain = new Brain();
		brain.think();
		
	}
}
