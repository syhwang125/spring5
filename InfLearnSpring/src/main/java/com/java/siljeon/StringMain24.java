package com.java.siljeon;

public class StringMain24 {

	public static void main(String[] args) {

		String str = new String("Java");
		System.out.println("str : " + str);

		StringBuffer sf = new StringBuffer("Java");
		sf.append(" World");
		System.out.println(sf.length());

		sf.delete(4, 8);
		System.out.println("sf : " + sf);

		StringBuilder sb = new StringBuilder("Java World!");
		System.out.println(sb);
	}

}
