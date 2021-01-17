package com.my.spring.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class BookStore {

	@Id @GeneratedValue
	private Integer id;
	
	private String name;
	
	@OneToMany(mappedBy = "bookStore")
	private Set<Book> books = new HashSet<>();
	
	void add(Book book) {
		this.books.add(book);
	}
}
