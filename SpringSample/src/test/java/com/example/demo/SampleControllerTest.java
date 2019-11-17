package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

public class SampleControllerTest {

//	@Autowired
//	@MockBean
//	private SampleRepostiory sampleRepository;
	
	@Test
	public void testDoSomething() {
		SampleRepostiory sampleRepository = new SampleRepostiory();
		SampleController sampleController = new SampleController(sampleRepository);
		sampleController.doSomething();
	}
}
