package com.java.designpattern.prototype;

public class PrototpyeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c1 = new Circle(1, 1, 3);
		Circle c2 = c1.copy();
		System.out.println(c1.getX() + "," + c1.getX() + "," + c1.getR());

		System.out.println(c2.getX() + "," + c2.getX() + "," + c2.getR());
	}

}
