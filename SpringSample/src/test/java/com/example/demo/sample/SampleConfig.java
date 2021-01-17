package com.example.demo.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

	@Bean
	public SampleController sampleController() {
		return new SampleController();
	}
	
}
