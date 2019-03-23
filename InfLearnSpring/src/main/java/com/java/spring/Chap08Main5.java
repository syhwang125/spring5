package com.java.spring;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//xml설정이 아닌 java @configuration 을 통해 profile 선언  
public class Chap08Main5 {

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
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(Chap08ApplicationConfigDev.class, Chap08ApplicationConfigProd.class);
		ctx.refresh();
		
		Chap08ServerInfo serverInfo = ctx.getBean("chap08ServerInfo", Chap08ServerInfo.class);
		System.out.println("ip : " + serverInfo.getIpNum());
		System.out.println("port num : " + serverInfo.getPortNum());
		ctx.close();
	}

}
