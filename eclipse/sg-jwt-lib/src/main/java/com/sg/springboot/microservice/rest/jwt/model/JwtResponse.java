package com.sg.springboot.microservice.rest.jwt.model;

import java.io.Serializable;

/**
 * This class is required for creating a response containing the JWT to be returned to the user. 
 *
 */
public class JwtResponse implements Serializable{
	private static final long serialVersionUID = -6046671574346658226L;
	private final String jwttoken;
	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
