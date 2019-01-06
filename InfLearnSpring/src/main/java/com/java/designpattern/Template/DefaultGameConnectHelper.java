package com.java.designpattern.Template;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("decode check");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("id and pwd checked");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("authorization check");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("connection check");
		return info;
	}

}
