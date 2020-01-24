package com.concordia.app.vo;

import org.springframework.stereotype.Component;

@Component
public class login{
	

	private int userId;
    private String role;
    private String userName;
    private String Password;
    private boolean flag;
    
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + (flag ? 1231 : 1237);
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		login other = (login) obj;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (flag != other.flag)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "login [userId=" + userId + ", role=" + role + ", userName=" + userName + ", Password=" + Password
				+ ", flag=" + flag + "]";
	}


	public boolean isFlag() {
		return flag;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	public login() {
		
		// TODO Auto-generated constructor stub
	}


	public login(int userId, String role, String userName, String password, boolean flag) {
		super();
		this.userId = userId;
		this.role = role;
		this.userName = userName;
		this.Password = password;
		this.flag = flag;
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
