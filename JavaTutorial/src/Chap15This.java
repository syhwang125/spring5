
public class Chap15This {
	public static void main(String[] args) {
		User u = new User();
		u.setUserName("Jane");
		System.out.println(u.getUserName());
	}
}


class User{
	String name;
	
	void setUserName(String name) {
		this.name = name;
	}
	
	String getUserName() {
		return this.name;
	}
}