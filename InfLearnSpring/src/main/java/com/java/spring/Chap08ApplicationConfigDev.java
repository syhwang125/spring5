package com.java.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")		
public class Chap08ApplicationConfigDev {

	@Bean
	public Chap08ServerInfo chap08ServerInfo() {
		Chap08ServerInfo info = new Chap08ServerInfo();
		info.setIpNum("localhost");
		info.setPortNum("8080");
		return info;
	}
}
