package com.concordia.app.vo;

public class CarCatalogue {
	
	private int CarID;

	private String type;

	private String make;

	private String model;

	private String year;

	private String color;

	private String licenceNum;
	
	private String Status;

	public CarCatalogue() {
		// TODO Auto-generated constructor stub
	}

	public CarCatalogue(int carID, String type, String make, String model, String year, String color, String licenceNum,
			String status) {
		super();
		this.CarID = carID;
		this.type = type;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.licenceNum = licenceNum;
		Status = status;
	}

	@Override
	public String toString() {
		return "CarCatalogue [CarID=" + CarID + ", type=" + type + ", make=" + make + ", model=" + model + ", year="
				+ year + ", color=" + color + ", licenceNum=" + licenceNum + ", Status=" + Status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CarID;
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((licenceNum == null) ? 0 : licenceNum.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		CarCatalogue other = (CarCatalogue) obj;
		if (CarID != other.CarID)
			return false;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (licenceNum == null) {
			if (other.licenceNum != null)
				return false;
		} else if (!licenceNum.equals(other.licenceNum))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	public int getCarID() {
		return CarID;
	}

	public void setCarID(int carID) {
		CarID = carID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLicenceNum() {
		return licenceNum;
	}

	public void setLicenceNum(String licenceNum) {
		this.licenceNum = licenceNum;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	 
	

	
}
