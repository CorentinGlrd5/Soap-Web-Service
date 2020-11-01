package com.corentin.guillard.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynov.nantes.soap.book.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {

}
