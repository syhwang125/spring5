package javapattern.bridge;

public class PrintMorseCode extends MorseCode {

	public PrintMorseCode(MorseCodeFunction fucntion) {
		super(fucntion);
	}
	
	public PrintMorseCode g() {
		dash();dash();dot();space();
		return this;
	}
	public PrintMorseCode a() {
		dot();dash();space();
		return this;
	}
	public PrintMorseCode r() {
		dot();dash();dot();space();
		return this;
	}
	public PrintMorseCode m() {
		dash();dash();space();
		return this;
	}
	
	
}
