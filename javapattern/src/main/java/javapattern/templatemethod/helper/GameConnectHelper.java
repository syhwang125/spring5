package javapattern.templatemethod.helper;

public abstract class GameConnectHelper {

	// 사용자가 게임 접속시 보안 절차 
	protected abstract String doSecurity(String str);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String username);
	protected abstract String connection(String info);
	
	public String requestConnection(String encodedInfo) {
		// 보안 작업 -> 암호화된 문자열을 복호화 
		String decodedInfo = doSecurity(encodedInfo);
		// 복호화된 아이디, 암호를 할당한다. 인증 과정 
		String id = "사용자";
		String password = "암호";
		if (!authentication(id, password)) {
			throw new Error("암호 불일치 ");
		}
		
		String userName = "userName" ;
		int i = authorization(userName); 
		
		// 권한 
		switch (i) {
		case 0:    // 게임 매니저 
			System.out.println(" 0 ") ;
			break;
		case 1:    // 유료 회원 
			System.out.println(" 1 ") ;
			break;
		case 2:    // 무료 회원 
			System.out.println(" 2 ") ;
			break;
		case 3:    // 권한 없음 
			System.out.println(" 3 ") ;
			break;
		default :
			System.out.println(" 9 ") ;
			break;
		}
		return connection(decodedInfo);
	}
}
