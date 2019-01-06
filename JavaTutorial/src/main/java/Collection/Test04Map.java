package Collection;

import java.util.List;
import java.util.OptionalDouble;

public class Test04Map {

	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		
		SearchCriteria search = SearchCriteria.getInstance();
		
		System.out.println(" == Calc ===" );
		int sum =0 ;
		int count = 0;
		
		for (Person  p:pl) {
			if(p.getAge() >= 23 && p.getAge() <= 65) {
				sum = sum + p.getAge();
				count++;
			}
		}
		
		long average = sum / count;
		System.out.print("total age " + sum);
		System.out.print("average age " + average);
		
		long totalAge = pl.stream().filter(search.getCriteria("allPilots")).mapToInt(p->p.getAge()).sum();
		
		OptionalDouble averageAge = pl.parallelStream().filter(search.getCriteria("allPilots")).mapToDouble(p->p.getAge()).average();
		
		System.out.println("total ages " + totalAge);
		System.out.println("avaerage age " + averageAge.getAsDouble());
		
		
	}

}
