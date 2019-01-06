import industry.Phone;

// 캡슐화는 주로 API를 만들때 사용되는 개념으로 숨길수 있는 변수/메소드는 숨기고, 유저에게 보여주면 안되는 것

public class Chap23Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.setNumber(1101876540);
		
		System.out.println("my Phone number is " + p.getNumber());
		
		System.out.println("my Phone model is " + Phone.getModel());	//static 변수는 객체인스턴스 불필요 
		
	}

}
