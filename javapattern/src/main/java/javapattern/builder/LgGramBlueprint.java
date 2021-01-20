package javapattern.builder;

public class LgGramBlueprint extends BluePrint {

	private Computer computer;
	
	private String cpu;
	private String ram;
	private String storage;
	
	public LgGramBlueprint() {
		computer = new Computer("default", "default", "default");
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("17");
		
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
		
	}

	@Override
	public void setStorage() {
		computer.setStorage("256g ssd");
		
	}
	@Override
	protected Computer getComputer() {
//		return new Computer(cpu, ram, storage);
		return computer;
	}

}
