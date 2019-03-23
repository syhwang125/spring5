package com.java.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class Chap08Application3Config {
	
	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;
	@Value("${sub-admin.id}")
	private String subAdminId;
	@Value("${sub-admin.pw}")
	private String subAdminPw;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] locations = new Resource[2];
		locations[0] = new ClassPathResource("chap08admin.properties");
		locations[1] = new ClassPathResource("chap08admin2.properties");
		
		configurer.setLocations(locations);
		return configurer;
		
	}
	
	@Bean
	public Chap08AdminConnection adminConfig() {
		Chap08AdminConnection adminConnection = new Chap08AdminConnection();
		adminConnection.setAdminId(adminId);
		adminConnection.setAdminPw(adminPw);
//		adminConnection.setSubAdminId(subAdminId);
//		adminConnection.setSubAdminPw(subAdminPw);
		return adminConnection;
	}
/*
	@Bean
	public Chap08Admin3Connection adminConfig() {
		Chap08Admin3Connection adminConnection = new Chap08Admin3Connection();
		adminConnection.setAdminId(adminId);
		adminConnection.setAdminPw(adminPw);
		adminConnection.setSubAdminId(subAdminId);
		adminConnection.setSubAdminPw(subAdminPw);
		return adminConnection;
	}
*/	
}
