package com.concordia.app.vo;

public class Clerk {

	private int clerkId;
	private String clerkName;
	private String clerkEmail;
	private String clearkPhoneNum;
	public int getClerkId() {
		return clerkId;
	}
	public void setClerkId(int clerkId) {
		this.clerkId = clerkId;
	}
	public String getClerkName() {
		return clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}
	public String getClerkEmail() {
		return clerkEmail;
	}
	public void setClerkEmail(String clerkEmail) {
		this.clerkEmail = clerkEmail;
	}
	public String getClearkPhoneNum() {
		return clearkPhoneNum;
	}
	public void setClearkPhoneNum(String clearkPhoneNum) {
		this.clearkPhoneNum = clearkPhoneNum;
	}
	@Override
	public String toString() {
		return "Clerk [clerkId=" + clerkId + ", clerkName=" + clerkName + ", clerkEmail=" + clerkEmail
				+ ", clearkPhoneNum=" + clearkPhoneNum + "]";
	}
	
	
	public Clerk()
	{
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clearkPhoneNum == null) ? 0 : clearkPhoneNum.hashCode());
		result = prime * result + ((clerkEmail == null) ? 0 : clerkEmail.hashCode());
		result = prime * result + clerkId;
		result = prime * result + ((clerkName == null) ? 0 : clerkName.hashCode());
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
		Clerk other = (Clerk) obj;
		if (clearkPhoneNum == null) {
			if (other.clearkPhoneNum != null)
				return false;
		} else if (!clearkPhoneNum.equals(other.clearkPhoneNum))
			return false;
		if (clerkEmail == null) {
			if (other.clerkEmail != null)
				return false;
		} else if (!clerkEmail.equals(other.clerkEmail))
			return false;
		if (clerkId != other.clerkId)
			return false;
		if (clerkName == null) {
			if (other.clerkName != null)
				return false;
		} else if (!clerkName.equals(other.clerkName))
			return false;
		return true;
	}
	public Clerk(int clerkId, String clerkName, String clerkEmail, String clearkPhoneNum) {
		super();
		this.clerkId = clerkId;
		this.clerkName = clerkName;
		this.clerkEmail = clerkEmail;
		this.clearkPhoneNum = clearkPhoneNum;
	}
	
	
	
}
