package com.corentin.guillard.soap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corentin.guillard.soap.entity.Author;
import com.corentin.guillard.soap.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> getAllAuthor() {
		return this.authorRepository.findAll();
	}
	/*
	public Author getOneAuthor() {
		String last_name = null;
		String first_name = null;
		return this.authorRepository.findByName(last_name, first_name);
	}
	*/
}
