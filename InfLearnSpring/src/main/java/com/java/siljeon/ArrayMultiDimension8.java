package com.java.siljeon;

import java.util.Arrays;

public class ArrayMultiDimension8 {

	public static void main(String[] args) {
		int[] arrAtt1 = {10,20,30,40,50};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		System.out.println("arrAtt1's 배열길이 	 : " + arrAtt1.length);
		System.out.println("arrAtt1's 배열 요소 출력  : " + Arrays.toString(arrAtt1));
		
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		
		System.out.println("arrAtt3 요소 복사  : " + Arrays.toString(arrAtt3));
		
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrArrtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
	
		System.out.println();
		System.out.println("#### 1차원 배열 대입 후 주소는 동일함 ########");
		
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		
		System.out.println();
		System.out.println("#### 2차원 배열 ########");
		System.out.println();
		
		int[][] arrMul = new int[3][2];
		
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 15;
		arrMul[1][1] = 150;
		arrMul[2][0] = 17;
		arrMul[2][1] = 170;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));
	}
	
	
}
