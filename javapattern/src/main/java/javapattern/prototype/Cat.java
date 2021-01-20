package javapattern.prototype;

public class Cat implements Cloneable {

	private String name;
	private Age age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age2) {
		this.age = age2;
	}

	public Cat copy() throws CloneNotSupportedException {
		Cat pet = (Cat) this.clone();
		pet.setAge(new Age(this.age.getYear(), this.age.getMonth()));
		return pet;
	}
}
