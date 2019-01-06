
public class Chap8Array {
	public static void main(String args[]) {
		int[] numbers = new int[3];
		
		numbers[0] = 4; 
		numbers[1] = 10;
		numbers[2] = 20;
		
		// numbers[3] = 20;
		System.out.println(numbers[0]);
		
		String[] inventory = new String[2];
		inventory[0] = "sword";
		inventory[1] = "knife";
		System.out.println(inventory[0]);
		
		String[] fruits = {"apple", "grape"};
		//System.out.println(fruits[1]);
		
		for (int x = 0; x < fruits.length; x++) {
			System.out.println(fruits[x]);
		}
		
	}
}
