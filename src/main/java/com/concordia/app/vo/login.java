package com.concordia.app.vo;

import org.springframework.stereotype.Component;


public class login {
	
	private int userId;
    private String role;
    private String userName;
    private String Password;
    
    
	public login() {
		
		// TODO Auto-generated constructor stub
	}


	public login(int userId, String role, String userName, String password) {
		super();
		this.userId = userId;
		this.role = role;
		this.userName = userName;
		Password = password;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	
	
    
    

}
