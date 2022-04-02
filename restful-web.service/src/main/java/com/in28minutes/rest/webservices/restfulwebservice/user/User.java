package com.in28minutes.rest.webservices.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description="All Details about user")
public class User {
	
	private Integer id;
	@Size(min = 2,message = "Name should have at least two carachter")
	@ApiModelProperty(notes = "Name should at leat be 2 caracters")
	private String name;
	@Past
	@ApiModelProperty(notes="Birth date can't be on the future")
	private Date birthDate;
	private List<Post> userPosts;

	public User(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = date;
		this.userPosts = new ArrayList<Post>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Post> getUserPosts() {
		return userPosts;
	}

	public void addPost(Post post) {
		userPosts.add(post);
	}
	public Post deleteUserPost(int id) {
		Post post = userPosts.get(id);
		userPosts.remove(id);
		return post;
	}

}
