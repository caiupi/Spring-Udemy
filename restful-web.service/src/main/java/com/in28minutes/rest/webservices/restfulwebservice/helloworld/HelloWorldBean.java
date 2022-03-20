package com.in28minutes.rest.webservices.restfulwebservice.helloworld;

public class HelloWorldBean extends HelloWorldController {
	private String message;

	public HelloWorldBean(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
}
