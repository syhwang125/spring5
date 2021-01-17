package com.my.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Book {

	@Id @GeneratedValue
	private Integer id;
	
	private String isbn;
	
	private String title;
	
	@ManyToOne
	private BookStore bookStore;
}
