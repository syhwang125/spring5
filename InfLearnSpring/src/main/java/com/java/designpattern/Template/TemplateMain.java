package com.java.designpattern.Template;

public class TemplateMain {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("아이디 암호 등 접속 정보 ");

	}

}
