package com.in28minutes.rest.webservices.restfulwebservice.user;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	@Autowired 
	private UserDaoService service;
	@GetMapping("/users")
	public List<User> retriveAllUsers(UserDaoService service) {
		return service.findAll();
	}
	@GetMapping("users/{id}")
	public User retriveUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	
}
