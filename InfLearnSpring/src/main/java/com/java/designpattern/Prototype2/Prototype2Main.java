package com.java.designpattern.Prototype2;

public class Prototype2Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("Navi");
		
		Cat yo = navi.copy();
		yo.setName("Yo");
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());

	}

}
