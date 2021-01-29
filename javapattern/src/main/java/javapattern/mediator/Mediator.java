package javapattern.mediator;

import java.util.List;

public abstract class Mediator {

	private List<Colleague> colleagues;
	
	public boolean addColleague(Colleague colleague) {
		if(colleagues != null) 
			return colleagues.add(colleague);
		else 
			return false;
	}
	
	public abstract void mediate(String data) ;
}
