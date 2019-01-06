package person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {
		List<Person> personList = Person.createShortList();
		
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});

		System.out.println("===== sort asc surname =====");
		
		for(Person p:personList) {
			p.printName();
		}
		
		// use Lambda 
		System.out.println("===== sort asc surname =====");
		Collections.sort(personList,  (Person p1, Person p2) ->
			p1.getSurName().compareTo(p2.getSurName()));
		
		for (Person p:personList) {
			p.printName();
		}
		
		System.out.println("===== sort desc surname =====");;
		Collections.sort(personList,  ( p1,  p2) ->
			p2.getSurName().compareTo(p1.getSurName()));
	
		for (Person p:personList) {
			p.printName();
		}
		
	}

}
