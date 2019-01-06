
public class Chap16Constructor {

	public static void main(String[] args) {
		UserName un = new UserName("Jeniffer");
	//	System.out.println(un.getUser());
	}
}


class UserName{
	String user;
	
	UserName() {
		System.out.println("자동생성 ~ ");
	}
	
	UserName(String name) {
		this.user = name;
		System.out.println("My Username is " + this.user);
	}
	
	void setUser(String name) {
		this.user = name;
	}
	
	String getUser() {
		return user;
	}
	
}
