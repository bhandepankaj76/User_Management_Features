package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;
    
    
	
    public RegisterDto(String name, String username, String email, String password) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */

    // USE Getters & Setters ( Name, Username, Email, Password )
	
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */
    
    
	/* - - - - - - - - - - - Getters & Setters ( Name ) - - - - - - - - - - - - - - */
    
    public RegisterDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/* - - - - - - - - - - - Getters & Setters ( Username ) - - - - - - - - - - - - */

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	/* - - - - - - - - - - - Getters & Setters ( Email ) - - - - - - - - - - - - */

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/* - - - - - - - - - - - Getters & Setters ( Password ) - - - - - - - - - - */

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */

	@Override
	public String toString() {
		return "RegisterDto [name=" + name + ", username=" + username + ", email=" + email + ", password=" + password
				+ "]";
	}
}
