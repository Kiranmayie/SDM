package com.concordia.app.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Component
public class trans {
	private int reservationId;
	//@DateTimeFormat(pattern = "yyyy/mm/dd")

	private Date startdate;
	//@DateTimeFormat(pattern = "yyyy/mm/dd")

	private Date duedate;
	private String licenseNumber;
	private String licensePlate;
	private String status;
	private boolean flag;
	
	public trans() {
		
		// TODO Auto-generated constructor stub
	}

	public trans(int reservationId, Date startdate, Date duedate, String licenseNumber, String licensePlate,
			String status, boolean flag) {
		super();
		this.reservationId = reservationId;
		this.startdate = startdate;
		this.duedate = duedate;
		this.licenseNumber = licenseNumber;
		this.licensePlate = licensePlate;
		this.status = status;
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "trans [reservationId=" + reservationId + ", startdate=" + startdate + ", duedate=" + duedate
				+ ", licenseNumber=" + licenseNumber + ", licensePlate=" + licensePlate + ", status=" + status
				+ ", flag=" + flag + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duedate == null) ? 0 : duedate.hashCode());
		result = prime * result + (flag ? 1231 : 1237);
		result = prime * result + ((licenseNumber == null) ? 0 : licenseNumber.hashCode());
		result = prime * result + ((licensePlate == null) ? 0 : licensePlate.hashCode());
		result = prime * result + reservationId;
		result = prime * result + ((startdate == null) ? 0 : startdate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		trans other = (trans) obj;
		if (duedate == null) {
			if (other.duedate != null)
				return false;
		} else if (!duedate.equals(other.duedate))
			return false;
		if (flag != other.flag)
			return false;
		if (licenseNumber == null) {
			if (other.licenseNumber != null)
				return false;
		} else if (!licenseNumber.equals(other.licenseNumber))
			return false;
		if (licensePlate == null) {
			if (other.licensePlate != null)
				return false;
		} else if (!licensePlate.equals(other.licensePlate))
			return false;
		if (reservationId != other.reservationId)
			return false;
		if (startdate == null) {
			if (other.startdate != null)
				return false;
		} else if (!startdate.equals(other.startdate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
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

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	
	
}
