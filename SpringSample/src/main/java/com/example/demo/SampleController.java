package com.example.demo;

public class SampleController {

	SampleRepostiory sampleRepository;
	
	public SampleController(SampleRepostiory sampleRepository) {
		this.sampleRepository = sampleRepository;
	}
	
	public void doSomething() {
		sampleRepository.save();
	}
}
