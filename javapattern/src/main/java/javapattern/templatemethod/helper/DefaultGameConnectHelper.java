package javapattern.templatemethod.helper;

public class DefaultGameConnectHelper extends GameConnectHelper {

	@Override
	protected String doSecurity(String decode) {
		System.out.println("강화된 알고리즘을 이용한 디코드 ");
		return decode;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정  ");
		return true;
	}

	@Override
	protected int authorization(String username) {
		System.out.println("권한 확인  ");
		// 서버에서 사용자의 이름, 나이를 확인한 후 접속 가능 시간을 체크 
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("접속 가능한 주소  ");
		return info;
	}

}
