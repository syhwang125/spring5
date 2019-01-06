package industry;

public enum EnumAnimal {
	// CAT, DOG, BIRD; 
	CAT("Tom"), DOG("Jerry"), BIRD("Sae"); 
	
	private String name;
	
	EnumAnimal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
