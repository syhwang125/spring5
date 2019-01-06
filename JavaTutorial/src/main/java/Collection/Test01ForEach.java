package Collection;

import java.util.List;

import person.Person;

public class Test01ForEach {

	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		
		System.out.println("\n === Western Phone List ==");
		pl.forEach(p -> p.printWesternName());
		
		pl.forEach(Person::printEasternName);
		
		System.out.println("===western pilot ==");
		pl.forEach(p -> {System.out.println(p.printCustom(r->"Name:" + r.getGivenName() + "email : " + r.getEmail())); });
		
	}

}
