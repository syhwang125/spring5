import java.util.ArrayList;

import industry.Laptop;
import industry.Phone;

// static 은 클래스 당 하나이고, instance 는 오브젝트당 하나임 
// static 은 클래스로부터 나왔기 때문에 어디서든지 호출이 가능하지만	
// instance는 객체로부터 나왔기 때문에 다른 클래스에서 호출할 수 없음 

public class Chap28Instance {
	public static void main(String[] args) {
		Phone.ID = 0;		// static variable 
		System.out.println(Phone.ID);
		
		
		Laptop notebook = new Laptop();
		notebook.ID = 1;	// instance variable 
		System.out.println(notebook.ID);
		
		Test test = new Test();
		test.changeNotebookID();
		
	}
}

 class Test {
	 Laptop notebook = new Laptop();
	 static void changePhoneID() {
		Phone.ID = 100;
	}
	
	 void changeNotebookID() {
		 notebook.ID = 200;
		 System.out.println("Test change  notebook id : " + notebook.ID); 
	 }
	
}
