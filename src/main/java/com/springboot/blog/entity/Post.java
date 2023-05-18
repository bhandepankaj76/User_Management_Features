package com.springboot.blog.entity;

import lombok.*;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(
        name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comments = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    
    
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	// Use Getters & Setters to ( ID, Title, Description, Content, comments, category )
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
    
   
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(Long id, String title, String description, String content, Set<Comment> comments, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.comments = comments;
		this.category = category;
	}

	/* - - - - - - - - - - - - - - Getters & Setters ( ID ) - - - - - - - - - - - - - - - - */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/* - - - - - - - - - - - - - - - - Getters & Setters ( Title ) - - - - - - - - - - - - - - - - - */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	/* - - - - - - - - - - - - - - Getters & Setters ( Description ) - - - - - - - - - - - - - - - - */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/* - - - - - - - - - - - - - - Getters & Setters ( Content ) - - - - - - - - - - - - - - - - */
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/* - - - - - - - - - - - - - - Getters & Setters ( Comments ) - - - - - - - - - - - - - - - - */
	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	/* - - - - - - - - - - - - - - Getters & Setters ( Category ) - - - - - - - - - - - - - - - - */
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */  
}