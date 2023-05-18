package com.springboot.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(name = "comments")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private String body;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id", nullable = false)
	private Post post;

	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	// Use Getters & Setters to ( ID, Name, Email, Body )
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(long id, String name, String email, String body, Post post) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.body = body;
		this.post = post;
	}

	/* - - - - - - - - - - - - - - Getters & Setters ( ID ) - - - - - - - - - - - - - - - - */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	/* - - - - - - - - - - - - - Getters & Setters ( Name ) - - - - - - - - - - - - - - - - */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* - - - - - - - - - - - - - Getters & Setters ( Email ) - - - - - - - - - - - - - - - - */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/* - - - - - - - - - - - - - Getters & Setters ( Body ) - - - - - - - - - - - - - - - - */
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	/* - - - - - - - - - - - - - Getters & Setters ( Post ) - - - - - - - - - - - - - - - - */
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */  
}