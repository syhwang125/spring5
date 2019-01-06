package Collection;

import java.util.List;
import java.util.stream.Collectors;

import person.Person;

public class Test02Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Person> pl = Person.createShortList();
		    
		    SearchCriteria search = SearchCriteria.getInstance();
		    
		    System.out.println("\n=== Western Pilot Phone List ===");

		    pl.stream().filter(search.getCriteria("allPilots"))
		      .forEach(Person::printWesternName);
		    
		    System.out.println("\n=== Eastern Draftee Phone List ===");

		    pl.stream().filter(search.getCriteria("allDraftees"))
		      .forEach(Person::printEasternName);

	}

}
