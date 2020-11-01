package com.corentin.guillard.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.corentin.guillard.soap.repository.AuthorRepository;
import com.ynov.nantes.soap.author.GetAuthorByIdRequest;
import com.ynov.nantes.soap.author.GetAuthorByIdResponse;
import com.ynov.nantes.soap.book.GetBookByIdResponse;

@Endpoint
public class AuthorEndpoint {
	
	private static final String NAMESPACE_URI = "http://localhost:7050/ws/author";

	private AuthorRepository authorRepository;

	@Autowired
	public AuthorEndpoint(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAuthorRequest")
	@ResponsePayload
	public GetAuthorByIdResponse getAuthor(@RequestPayload GetAuthorByIdRequest request) {
		GetAuthorByIdResponse response = new GetAuthorByIdResponse();
		response.setAuthor(authorRepository.findById(request.getId()));
		return response;
	}
	
}
