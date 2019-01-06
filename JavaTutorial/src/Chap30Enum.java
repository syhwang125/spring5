import industry.EnumAnimal;

// Enum 열거형 데이터 타입으로 정해진 수의 상수들을 열거할때 사용되는 데이터 타입 

public class Chap30Enum {

	/*
	public static final int CAT = 0;
	public static final int DOG = 1;
	public static final int BIRD = 2;
	
	public static void main(String[] args) {
		int animal = BIRD;
		
		switch (animal) {
		case CAT :
			System.out.println("고양이");
			break;
		case DOG :
			System.out.println("강아지");
			break;
		case BIRD :
			System.out.println("새");
			break;			
		}

	}
	*/
	
	// Enum 클래스 (EnumAnimal) 로 생성한 후 다시 호출해 보자.  
	
	public static void main(String[] args) {
		
		EnumAnimal animal = EnumAnimal.BIRD;
		
		switch(animal) {
		case BIRD :
			System.out.println("새");
			break;
		case CAT:
			System.out.println("고양이");
			break;
		case DOG:
			System.out.println("강아지");
			break;
		default:
			break; 
			
		}
		
		System.out.println(animal.getName());
		
		System.out.println(EnumAnimal.DOG.getName());
		
	}

}
