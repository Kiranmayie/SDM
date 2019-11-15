package com.concordia.app.vo;

import java.sql.Date;

public class CarReturn {
	String type;
	String licensePlate;
	String availability;
	Date startDate;
	Date dueDate;
	String licenseNumber;
	public CarReturn() {
		// TODO Auto-generated constructor stub
	}
	public CarReturn(String type, String licensePlate, String availability, Date startDate, Date dueDate,
			String licenseNumber) {
		super();
		this.type = type;
		this.licensePlate = licensePlate;
		this.availability = availability;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.licenseNumber = licenseNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	@Override
	public String toString() {
		return "CarReturn [type=" + type + ", licensePlate=" + licensePlate + ", availability=" + availability
				+ ", startDate=" + startDate + ", dueDate=" + dueDate + ", licenseNumber=" + licenseNumber + "]";
	}
	
	
	
	

}
