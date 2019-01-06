package com.java.siljeon;

import java.util.Arrays;

public class ObjectClass extends Object {

	public int x;
	public int y;

	public void getInfo() {
		System.out.println("ObjectClass's getInfo()");
		System.out.println("ObjectClass's getInfo()  x 's val = " + x);
		System.out.println("ObjectClass's getInfo() y's val = " + y);
	}

	public ObjectClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public ObjectClass() {
		System.out.println("Constructor");
	}

	public ObjectClass(String s, int[] iArr) {
		System.out.println(" ### ObjectClass() ###");

		System.out.println(" s -> " + s);
		System.out.println(" iArr[0] -> " + iArr[0]);
		System.out.println(" iArr's value -> " + Arrays.toString(iArr));
		System.out.println(" iArr toString -> " + iArr.toString());
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
		super.finalize();
	}

}
