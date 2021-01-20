package javapattern.builder;

public class BuilderMain {

	// 복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브클래스에게 넘겨주는 패턴 
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBlueprint(new LgGramBlueprint());
		
		factory.make();
		
		
		Computer computer = factory.getComputer(); 
		
//		Computer computer = new Computer("17", "16g","256g ssd");
		
		System.out.println(computer.toString());
		System.out.println(computer.getRam() + " , " + computer.getCpu() + " , " + computer.getStorage());
	}

}
