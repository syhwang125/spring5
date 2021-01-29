package javapattern.mediator;

public class MediatorApp {

	public static void main(String[] args) {
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague(); 
		
		Mediator mediator = new ChatMediator();
		
		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);
		
		colleague1.sendData("AAAA");
		colleague2.sendData("BBBB");
		colleague3.sendData("CCCC");
	}

}
