package com.example.demo.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {

	private static final Logger logger = LoggerFactory.getLogger(SampleRepository.class);
	public void save() {
		logger.info("#### SampleRepository ###");
	}

	
}
