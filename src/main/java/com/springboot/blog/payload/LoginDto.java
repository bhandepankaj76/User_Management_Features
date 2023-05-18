package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
public class LoginDto {
    private String usernameOrEmail;
    public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginDto(String usernameOrEmail, String password) {
		super();
		this.usernameOrEmail = usernameOrEmail;
		this.password = password;
	}
	private String password;
	
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	// Use Getters & Setters to ( UsernameOrEmail, Password )
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
    
    
	/* - - - - - - - - - - - - - - - - Getters & Setters ( UsernameOrEmail )  - - - - - - - - - - */
    public String getUsernameOrEmail() {
		return usernameOrEmail;
	}
	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}
	
	/* - - - - - - - - - - - - - - - - Getters & Setters ( Password ) - - - - - - - - - - - - - - */
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
	 /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	}
}