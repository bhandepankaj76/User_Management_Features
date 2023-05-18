package com.springboot.blog.payload;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
	
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */

	// Get ( Timestamp, Message, Details )
	 
    /* - - - - - - - - - - - - - - - - - - - - - - - - - */

    
	/* - - - - - - - - - - - - - - - - Get ( Timestamp ) - - - - - - - - - - - - - - - - */
    public Date getTimestamp() {
        return timestamp;
    }

	/* - - - - - - - - - - - - - - - - Get ( Message ) - - - - - - - - - - - - - - - - - */
    public String getMessage() {
        return message;
    }

	/* - - - - - - - - - - - - - - - - Get ( Details ) - - - - - - - - - - - - - - - - - */
    public String getDetails() {
        return details;
        
   	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
    }
}
