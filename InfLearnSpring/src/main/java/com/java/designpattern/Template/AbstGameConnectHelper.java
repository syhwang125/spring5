package com.java.designpattern.Template;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	public String requestConnection(String encodedInfo) {
		String id, password, userName, userInfo, decodedInfo;

		// 보안작업 -> 암호화된 문자열을 복호화
		decodedInfo = doSecurity(encodedInfo);
		id = "syacorn";
		password = "1234";

		if (!authentication(id, password)) {
			throw new Error("암호 불일치 ");
		}

		// userInfo에서 userName을 찾아 냅니다.
		userName = "abc";

		int result = authorization(userName);
		// userInfo에서 userName을 찾아 냅니다.

		switch (result) {

		case 0:// 무료회원
			break;
		case 1:// 유료회원
			break;
		case 2:// 게임 마스터
			break;
		case 3:// 접속 권한 없음
			break;
		default:
			break;
		}

		return connection(decodedInfo);

	}

}
