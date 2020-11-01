package com.corentin.guillard.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynov.nantes.soap.author.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
}
