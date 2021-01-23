package javapattern.bridge;

public class BridgeApp {

	public static void main(String[] args) {
		
		PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
		
//		code.g();code.a();code.r();code.a();code.m();

//		System.out.println();
//		System.out.println(" Morse Code : garam ");
		
		code.g().a().r().a().m();
	}

}
