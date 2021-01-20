package javapattern.builders;

public class BuilderApp {

	public static void main(String[] args) {
//		Computer computer = new Computer("256g ssd", "i7", "8g");

		Computer computer2 =  ComputerBuilder
//				.start()
				.startWithCpu("i7")
//				.setCpu("i7")
				.setRam("8g")
				.setStorage("256g ssd")
				.build();
		
		System.out.println(computer2.toString());
	}

}
