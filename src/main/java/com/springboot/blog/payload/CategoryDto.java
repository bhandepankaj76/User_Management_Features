package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class CategoryDto {
    private Long id;
    private String name;
    private String description;
	
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	// Use Getters & Setters to ( ID, Name, Description )
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
    
	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryDto(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	/* - - - - - - - - - - - - - - - - Getters & Setters ( Id ) - - - - - - - - - - - - - - - - - */
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	/* - - - - - - - - - - - - - - - - Getters & Setters ( Name ) - - - - - - - - - - - - - - - - - */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/* - - - - - - - - - - - - - - - - Getters & Setters ( Description ) - - - - - - - - - - - - - */
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
		
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	}
}