package com.corentin.guillard.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.corentin.guillard.soap.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
	/* @Query("SELECT a FROM Author a WHERE a.last_name LIKE %:last_name% or a first_name LIKE %:first_name%")
	public Author findByName(@Param("last_name") String last_name, @Param("first_name") String first_name);
	*/
	
}
