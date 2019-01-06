package com.java.designpattern.builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		factory.setBluePrint(new LgGramBlueprint() );
//		factory.setBluePrint(new MacAirBlueprint() );
//		factory.setBluePrint(new SonyBlueprint() );
//		factory.makeAndGet();
		
//		Computer computer = new factory.make();
		factory.make();
		Computer computer = factory.getComputer();
		
		
//		Computer computer = new Computer("256g ssd","17","8g");
		
		
//		Computer computer = ComputerBuilder
//				.start()
//				.startWithCpu("i7")
//				.setCpu("i7")
//				.setRam("16GB")
//				.build();
		
		System.out.println(computer.toString());
		
		
	}
	
	

}
