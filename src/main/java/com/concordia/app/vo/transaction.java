package com.concordia.app.vo;

import java.util.Date;

public class transaction {
	private int reservationId;
	private Date startdate;
	private Date duedate;
	private String licenseNumber;
	private String licensePlate;
	private String status;
	public transaction(int reservationId, Date startdate, Date duedate, String licenseNumber, String licensePlate,
			String status) {
		super();
		this.reservationId = reservationId;
		this.startdate = startdate;
		this.duedate = duedate;
		this.licenseNumber = licenseNumber;
		this.licensePlate = licensePlate;
		this.status = status;
	}
	public transaction() {
		
		// TODO Auto-generated constructor stub
	}
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
