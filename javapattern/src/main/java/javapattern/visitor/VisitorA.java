package javapattern.visitor;

public class VisitorA implements Visitor {

	private int ageSum;
	
	public VisitorA() {
		ageSum = 0;
	}
	
	
	@Override
	public void visit(Visitable visitable) {
		
		if(visitable instanceof VisitableA) {
			ageSum += ((VisitableA) visitable).getAge(); 
		} else {
			
			System.out.println("hello");
		}
	}


	public int getAgeSum() {
		return ageSum;
	}


	public void setAgeSum(int ageSum) {
		this.ageSum = ageSum;
	}

}
