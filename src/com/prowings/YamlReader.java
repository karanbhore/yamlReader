package com.prowings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class YamlReader {


	    @Value("${myapp.username}")
	    private String username;

	    @Value("${myapp.password}")
	    private String password;

	    // Getter methods
	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }
	}


