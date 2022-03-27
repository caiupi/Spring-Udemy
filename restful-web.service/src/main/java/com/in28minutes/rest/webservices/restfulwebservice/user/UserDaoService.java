package com.in28minutes.rest.webservices.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	static {
		Post post = new Post(1, "Hello", "This is my first post");
		User user = new User(1, "Adam", new Date());
		user.addPost(post);
		users.add(user);
		users.get(0).addPost(post);
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
	}
	private static int userCount = 3;

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	public User deleteByID(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

	public List<Post> getAllUserPosts(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user.getUserPosts();
		}
		return null;
	}
}
