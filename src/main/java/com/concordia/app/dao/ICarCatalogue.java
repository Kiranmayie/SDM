package com.concordia.app.dao;

import java.util.List;

import com.concordia.app.vo.CarCatalogue;

public interface ICarCatalogue {
	
	CarCatalogue add(CarCatalogue carCatalogue);
	CarCatalogue findById(int id);
	List<CarCatalogue> findCarCatalogue();
	void update(CarCatalogue carCatalogue);
	void delete(int id);
	void updateRented(String licenseNum);
	void updateReserved(String licenseNum);
	void updateAvailable(String lnValue);
	
	
	

}
