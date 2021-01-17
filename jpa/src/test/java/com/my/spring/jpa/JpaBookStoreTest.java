package com.my.spring.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaBookStoreTest {

	@Autowired
	BookStoreRepository bookStoreRepository;
	
	@Test
	public void contextLoads() {
		BookStore bookStore = new BookStore();
		bookStore.setName("seatle's bookstore");
		bookStoreRepository.save(bookStore);
		
		Book book = new Book();
		book.setTitle("Study about JPA");
		
		bookStore.add(book);
		
		bookRepostiory.save(book);
	}
}
