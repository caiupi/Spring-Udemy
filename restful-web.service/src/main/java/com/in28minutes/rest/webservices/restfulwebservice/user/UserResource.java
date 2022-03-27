package com.in28minutes.rest.webservices.restfulwebservice.user;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		 User user = service.findOne(id);
		 if(user==null) {
			 throw new UserNotFoundExveption("ID : "+id);
		 }
		 return user;
	}
	@GetMapping("users/{id}/posts")
	public List<Post> retriveUserPosts(@PathVariable int id) {
		 User user = service.findOne(id);
		 if(user==null) {
			 throw new UserNotFoundExveption("ID : "+id);
		 }
		 return user.getUserPosts();
	}
	
	@PostMapping("users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser=service.save(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
		.path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

}
