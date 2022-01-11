package com.project3.revtech.response;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private int user_id;
	private String username;
	private String email;
	private List<String> roles;
	private String first_name;
	private String last_name;
	private String address;
	private String contact;

	public JwtResponse(String accessToken, int user_id, String username, String email, List<String> roles, String first_name, String last_name, String address, String contact) {
	    this.token = accessToken;
	    this.user_id = user_id;
	    this.username = username;
	    this.email = email;
	    this.roles = roles;
	    this.first_name = first_name;
	    this.last_name = last_name;
	    this.address = address;
	    this.contact = contact;
	  }

	public String getAccessToken() {
	    return token;
	  }

	  public void setAccessToken(String accessToken) {
	    this.token = accessToken;
	  }

	  public String getTokenType() {
	    return type;
	  }

	  public void setTokenType(String tokenType) {
	    this.type = tokenType;
	  }


	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	

}
