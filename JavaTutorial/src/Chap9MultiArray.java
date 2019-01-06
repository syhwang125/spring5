
public class Chap9MultiArray {
	public static void main(String args[]) {
		int[][] numbers = {
				{10,30,80},
				{1,3,8},
				{100,200,300}
		};
		
		System.out.println(numbers[0][1]); 
		
		String[][] inventory = new String[2][4];
		inventory[0][1] = "sword";
		System.out.println(inventory[0][1]);
		
		for (int x = 0; x < numbers.length; x++) {
			for (int y = 0; y < numbers[x].length; y++) {
				System.out.print(numbers[x][y] + "\t");
			}
			System.out.println();
		}
	}
}
