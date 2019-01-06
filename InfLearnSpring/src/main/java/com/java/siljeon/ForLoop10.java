package com.java.siljeon;

import java.util.Scanner;

public class ForLoop10 {

	public static void main(String[] args) {
		System.out.println("Input Number : " );

		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		System.out.println(" #### for loop #### ");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d \n ", inputNum , i , (inputNum * i) );
		}
		
		System.out.println(" #### while #### ");
		int i = 1;
		while(i<10) {
			System.out.printf("%d * %d = %d \n ", inputNum , i , (inputNum * i) );
			i++;
		}
		
		System.out.println(" #### do~while #### 무조건 한번은 실행한 후 while문의 조건을 비교함  ");
		int j=10;
		do {
			System.out.printf("%d * %d = %d \n ", inputNum , j , (inputNum * j) );
			j++;
		} while(j<13);
	}

}
