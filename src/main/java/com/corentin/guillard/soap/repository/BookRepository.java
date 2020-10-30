package com.corentin.guillard.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.corentin.guillard.soap.entity.Author;
import com.corentin.guillard.soap.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
	/* @Query("SELECT b FROM Book b WHERE b.title LIKE %:title%")
	public Book findByTitle(@Param("title") String title);
	*/

}
