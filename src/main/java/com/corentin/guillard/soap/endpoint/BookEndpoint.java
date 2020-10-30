package com.corentin.guillard.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.corentin.guillard.soap.repository.BookRepository;

@Endpoint
public class BookEndpoint {
	
	private static final String NAMESPACE_URI = "http://localhost:7050/ws/book";

	private BookRepository bookRepository;

	@Autowired
	public BookEndpoint(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
	@ResponsePayload
	public GetAuthorResponse getBook(@RequestPayload GetBookRequest request) {
		return null;
	}

}
