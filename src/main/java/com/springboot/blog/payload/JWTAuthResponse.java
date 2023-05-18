package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
public class JWTAuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */

    // USE Getters & Setters ( AccessToken, TokenType )
	
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */

    
   	public JWTAuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JWTAuthResponse(String accessToken, String tokenType) {
		super();
		this.accessToken = accessToken;
		this.tokenType = tokenType;
	}
	/* - - - - - - - - - - - Getters & Setters ( Token ) - - - - - - - - - - - - - - */
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
   	/* - - - - - - - - - - - Getters & Setters ( TokenType ) - - - - - - - - - - - - */

	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
   	/* - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - */	
}