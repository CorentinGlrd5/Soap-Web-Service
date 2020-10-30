package com.corentin.guillard.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.corentin.guillard.soap.repository.AuthorRepository;

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
	public GetAuthorResponse getAuthor(@RequestPayload GetAuthorRequest request) {
		return null;
	}
}
