package com.java.siljeon;

public class AnonymousMain20 {

	public static void main(String[] args) {
		// innerclass
		OuterClass oc = new OuterClass();
		System.out.println("oc.num : " + oc.num);
		System.out.println("oc.str1 : " + oc.str1);

		System.out.println();
		
		OuterClass.InnerClass in = oc.new InnerClass();
		System.out.println("in.num : " + in.num);
		System.out.println("in.str2 : " + in.str2);
		System.out.println();
		
		OuterClass.SInnerClass sin = new OuterClass.SInnerClass();
		System.out.println("sin.sum : " + sin.num);
		System.out.println("sin.str3 : " + sin.str3);
		
		System.out.println();
		
		// anonymous class 
		
		new AnonymousClass () {
			@Override
			public void method() {
				System.out.println(" main method -- anonymous class method called. ");
			};
		}.method();
		
		
	}

}
