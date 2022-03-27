package com.in28minutes.rest.webservices.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExveption extends RuntimeException {
	
	public UserNotFoundExveption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
