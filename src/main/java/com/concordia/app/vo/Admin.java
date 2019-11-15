package com.concordia.app.vo;

public class Admin {
	
	private int adminID;
	private String adminName;
	public int getAdminID() {
		return adminID;
	}
	
	public Admin()
	{
		
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminName=" + adminName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adminID;
		result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
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
		Admin other = (Admin) obj;
		if (adminID != other.adminID)
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		return true;
	}
	public Admin(int adminID, String adminName) {
		super();
		this.adminID = adminID;
		this.adminName = adminName;
	}
	
	

}
