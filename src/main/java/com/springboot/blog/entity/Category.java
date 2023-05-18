package com.springboot.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Long id, String name, String description, List<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.posts = posts;
	}

	private String name;
    private String description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;
    
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	// Use Getters & Setters to ( ID, Name, Description, Posts )
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
    
	/* - - - - - - - - - - - - - - Getters & Setters ( ID ) - - - - - - - - - - - - - - - - */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/* - - - - - - - - - - - - - Getters & Setters ( Name ) - - - - - - - - - - - - - - - - */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* - - - - - - - - - - - Getters & Setters ( Description ) - - - - - - - - - - - - - - */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/* - - - - - - - - - - - - - Getters & Setters ( Posts ) - - - - - - - - - - - - - - - */
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */  
}
