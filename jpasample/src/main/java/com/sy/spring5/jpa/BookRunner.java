package com.sy.spring5.jpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BookRunner implements ApplicationRunner {

	@Autowired
	BookRepository bookRepository;
	
	public void run(ApplicationArguments args) throws Exception {
		Book book = new Book();
		book.setName("Docker Book");
		book.setCreated(new Date());

		bookRepository.save(book);
	}

}
