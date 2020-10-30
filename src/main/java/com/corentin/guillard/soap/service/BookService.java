package com.corentin.guillard.soap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corentin.guillard.soap.entity.Author;
import com.corentin.guillard.soap.entity.Book;
import com.corentin.guillard.soap.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBook() {
		return this.bookRepository.findAll();
	}
	/*
	public Book getOneBook() {
		String title = null;
		return this.bookRepository.findByTitle(title);
	}
	*/

}
