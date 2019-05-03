package com.java.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")		
public class Chap08ApplicationConfigProd {

	@Bean
	public Chap08ServerInfo chap08ServerInfo() {
		Chap08ServerInfo info = new Chap08ServerInfo();
		info.setIpNum("203.238.222.42");
		info.setPortNum("8082");
		return info;
	}
}