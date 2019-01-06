import java.util.ArrayList;

class Gen<T> {
	private T something;
	
	public void setSomething(T value) {
		something = value;
	}
	
	public T getSomething() {
		return something;
	}
}
// Generic 은 클래스 안에서 사용될 타입을 클래스 밖에서 지정하는 기법 
public class Chap26Generic {

	public static void main(String[] args) {
		Gen<String> gen = new Gen<String>();
		gen.setSomething("Generic");
		System.out.println(gen.getSomething());

		Gen<Integer> gen2 = new Gen<Integer>();
		gen2.setSomething(234);
		System.out.println(gen2.getSomething());

		ArrayList<String> array = new ArrayList<String>();
		array.add("banana");
		array.add("apple");
		array.add("orange");
		
		System.out.println(array.get(2));
	}

}
