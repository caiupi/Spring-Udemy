package com.in28minutes.rest.webservices.restfulwebservice.versioning;

public class PersonV2 {

	private Name name;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PersonV2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonV2(Name name) {
		super();
		this.name = name;
	}
	
}
