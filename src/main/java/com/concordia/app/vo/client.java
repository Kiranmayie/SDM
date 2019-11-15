package com.concordia.app.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class client {


private String clientDL;
private Date  expDate;
private String phoneNum;
private String firstName;
private String lastName;
public client() {
	// TODO Auto-generated constructor stub
}
public client(String clientDL, Date expDate, String phoneNum, String firstName, String lastName) {
	super();
	this.clientDL = clientDL;
	this.expDate = expDate;
	this.phoneNum = phoneNum;
	this.firstName = firstName;
	this.lastName = lastName;
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
public String getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
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
@Override
public String toString() {
	return "client [clientDL=" + clientDL + ", expDate=" + expDate + ", phoneNum=" + phoneNum + ", firstName="
			+ firstName + ", lastName=" + lastName + "]";
}



}
