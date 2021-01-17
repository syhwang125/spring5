package com.example.demo.sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
//@WebMvcTest(SampleController.class)
@SpringBootTest
public class SampleControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	ApplicationContext applicationContext;
	
	
	@MockBean
	private SampleRepository sampleRepository;

	@Test
	public void testDI() {
		SampleController bean = applicationContext.getBean(SampleController.class);
		logger.info("#####" + bean);
		assertThat(bean).isNotNull();
		
	}

}
