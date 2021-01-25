package javapattern.chainofresponsibility3;

public class CoRTest {

	public static void main(String[] args) {
		Problem[] problems = new Problem[5];
		problems[0] = new Problem("덩치 큰 깡패 ");
		problems[1] = new Problem("컴퓨터 보안장치 ");
		problems[2] = new Problem("까칠한 여자 ");
		problems[3] = new Problem("날렵한 깡패 ");
		problems[4] = new Problem("폭탄 ");

		Expert fighter = new Fighter();
		Expert hacker = new Hacker();
		Expert casanova = new Casanova();
		
		fighter.setNext(hacker).setNext(casanova);
		
		for(Problem problem : problems) {
			fighter.support(problem);
		}
	}

}
