package com.corentin.guillard.soap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corentin.guillard.soap.repository.BookRepository;
import com.ynov.nantes.soap.book.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBook() {
		return this.bookRepository.findAll();
	}

}
