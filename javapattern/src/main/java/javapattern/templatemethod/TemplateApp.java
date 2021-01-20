package javapattern.templatemethod;

import javapattern.templatemethod.helper.DefaultGameConnectHelper;
import javapattern.templatemethod.helper.GameConnectHelper;

public class TemplateApp {

	public static void main(String[] args) {
		GameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("아이디 암호 등 접속 정보 ");
	}

}
