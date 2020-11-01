package com.corentin.guillard.soap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corentin.guillard.soap.repository.AuthorRepository;
import com.ynov.nantes.soap.author.Author;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> getAllAuthor() {
		return this.authorRepository.findAll();
	}
}
