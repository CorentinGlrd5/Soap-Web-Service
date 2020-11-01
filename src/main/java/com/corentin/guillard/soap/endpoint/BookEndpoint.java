package com.corentin.guillard.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.corentin.guillard.soap.repository.BookRepository;
import com.ynov.nantes.soap.book.GetBookByIdRequest;
import com.ynov.nantes.soap.book.GetBookByIdResponse;

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
	public GetBookByIdResponse getBookById(@RequestPayload GetBookByIdRequest request) {
		GetBookByIdResponse response = new GetBookByIdResponse();
		response.setBook(bookRepository.findById(request.getId()));
		return response;
	}
	

}
