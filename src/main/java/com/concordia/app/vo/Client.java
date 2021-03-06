package com.concordia.app.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Component
public class Client {

	private String clientDL;
	//@DateTimeFormat(pattern = "yyyy/mm/dd")
	private Date  expDate;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private boolean flag;
	public Client() {
		
		// TODO Auto-generated constructor stub
	}
	public Client(String clientDL, Date expDate, String phoneNumber, String firstName, String lastName, boolean flag) {
		super();
		this.clientDL = clientDL;
		this.expDate = expDate;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Client [clientDL=" + clientDL + ", expDate=" + expDate + ", phoneNumber=" + phoneNumber + ", firstName="
				+ firstName + ", lastName=" + lastName + ", flag=" + flag + "]";
	}
	public String getClientDL() {
		return clientDL;
	}
	public void setClientDL(String clientDL) {
		this.clientDL = clientDL;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientDL == null) ? 0 : clientDL.hashCode());
		result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (flag ? 1231 : 1237);
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		Client other = (Client) obj;
		if (clientDL == null) {
			if (other.clientDL != null)
				return false;
		} else if (!clientDL.equals(other.clientDL))
			return false;
		if (expDate == null) {
			if (other.expDate != null)
				return false;
		} else if (!expDate.equals(other.expDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (flag != other.flag)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	
	
	

}
