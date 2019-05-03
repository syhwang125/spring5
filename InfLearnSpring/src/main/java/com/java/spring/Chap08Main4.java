package com.java.spring;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

// XML 설정을 통한 프로파일 가져오기 
public class Chap08Main4 {

	public static void main(String[] args) {
		String config = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(str.equals("dev")) {
			config = "dev";
		} else if (str.equals("prod")) {
			config = "prod";
		}
		
		scanner.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX-08-4-DEV.xml", "applicationCTX-08-4-PROD.xml");
		ctx.refresh();

		Chap08ServerInfo serverInfo = ctx.getBean("chap08ServerInfo", Chap08ServerInfo.class);
		System.out.println("ip : " + serverInfo.getIpNum());
		System.out.println("port num : " + serverInfo.getPortNum());
		ctx.close();

	}

}
