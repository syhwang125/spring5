package com.java.siljeon;

public class Constructor15 {

	public static void main(String[] args) {

		int[] iArr = { 10, 20, 30 };

		ObjectClass oc = new ObjectClass("hello ", iArr);
		System.out.println(" ### main() ###");
		System.out.println(oc);

		ObjectClass val = new ObjectClass(10, 15);
		val.getInfo();
	}

}
