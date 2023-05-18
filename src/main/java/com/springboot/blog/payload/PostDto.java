package com.springboot.blog.payload;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Set;

//@Data
public class PostDto {
    public PostDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostDto(long id,
			@NotEmpty @Size(min = 2, message = "Post title should have at least 2 characters") String title,
			@NotEmpty @Size(min = 10, message = "Post description should have at least 10 characters") String description,
			@NotEmpty String content, Set<CommentDto> comments, Long categoryId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.comments = comments;
		this.categoryId = categoryId;
	}

	private long id;

    // title should not be null  or empty
    // title should have at least 2 characters
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    // post description should be not null or empty
    // post description should have at least 10 characters
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    // post content should not be null or empty
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;

    
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */

    // USE Getters & Setters ( ID, Tittle, Description, Content, Comments, CategoryId )
	
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */

    
	/* - - - - - - - - - - - Getters & Setters ( ID ) - - - - - - - - - - - - - - */
    private Long categoryId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/* - - - - - - - - - - - Getters & Setters ( Tittle ) - - - - - - - - - - - - - - */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	/* - - - - - - - - - - - Getters & Setters ( Description ) - - - - - - - - - - - - - - */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/* - - - - - - - - - - - Getters & Setters ( Content ) - - - - - - - - - - - - - - */
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/* - - - - - - - - - - - Getters & Setters ( Comments ) - - - - - - - - - - - - - - */
	public Set<CommentDto> getComments() {
		return comments;
	}

	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}

	/* - - - - - - - - - - - Getters & Setters ( CategoryId ) - - - - - - - - - - - - - - */
	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */	
	}
}