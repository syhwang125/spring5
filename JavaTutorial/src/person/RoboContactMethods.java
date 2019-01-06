package person;

import java.util.List;

public class RoboContactMethods {
	public void callDrivers(List<Person> p1) {
		for(Person p:p1) {
			if(p.getAge() >= 16 ) {
				roboCall(p);
			}
		}
	}
	


	public void emailDraftees(List<Person> p1) {
		for(Person p:p1) {
			if(p.getAge()>=18 && p.getAge() <= 25 && p.getGender() == Gender.MALE) {
				roboEmail(p);
			}
		}
	}

	public void mailPilots(List<Person> p1) {
		for(Person p:p1) {
			if(p.getAge()>=23 && p.getAge() <= 65 ) {
				roboMail(p);
			}
		}
	}
	
	private void roboMail(Person p) {
		System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + 
				p.getAge() + " at " + p.getAddress()	);
	}



	public void roboCall(Person p) {
		System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + 
				p.getAge() + " at " + p.getAddress()	);
	}
	
	public void roboEmail(Person p) {
		System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + 
				p.getAge() + " at " + p.getAddress()	);
		
	}
	
	
}
