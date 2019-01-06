package com.java.siljeon;

public class ObjectMemory14 {

	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();

		System.out.println(" obj1 : " + obj1);
		System.out.println(" obj2 : " + obj2);
		System.out.println(" obj3 : " + obj3);

		if (obj1 == obj2) {
			System.out.println(" obj1 == obj2 ");
		} else {
			System.out.println(" obj1 != obj2 ");
		}

		obj1.getInfo();

		obj1 = null;

		// obj1.getInfo();

		obj2.getInfo();
	}

}
