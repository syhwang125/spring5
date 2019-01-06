// 가변인자 varargs 

class Calculators {
	
//	public void printAvg(double[] numbers) {    // 가변인자 선인시 불필
	
	public void printAvg(double... numbers) {     
		// ... 가변인자를 사용하면 아래 호출부에서 미리 선언없이 매개변수를 마음대로 보낼 수 있다. 
		double sum = 0;
		int size = numbers.length;
		for(double num : numbers) {
			sum = sum + num;
		}
		double avg = sum/size;
		System.out.println("평균은 " + avg);
		
	}
}
public class Chap38VarArgs {

	public static void main(String[] args) {
		Calculators cal = new Calculators();
	//	double[] numbers = {10,5, 7, 8, 9};	// 가변인자 선언시 불필
	//	cal.printAvg(numbers);				
		
		cal.printAvg(10,5,10,1,7);
	}

}
