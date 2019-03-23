package com.java.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class Chap08Admin2Connection implements EnvironmentAware, DisposableBean {

	private String adminId;
	private String adminPw;
	private String subAdminId;
	private String subAdminPw;

	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public String getSubAdminId() {
		return subAdminId;
	}
	public void setSubAdminId(String subAdminId) {
		this.subAdminId = subAdminId;
	}
	public String getSubAdminPw() {
		return subAdminPw;
	}
	public void setSubAdminPw(String subAdminPw) {
		this.subAdminPw = subAdminPw;


	}
	public void destroy() throws Exception {
		System.out.println("destroy method called ");
		
	}
	public void setEnvironment(Environment env) {
		System.out.println("afterPropertiesSet method called ");
		
	}
}
