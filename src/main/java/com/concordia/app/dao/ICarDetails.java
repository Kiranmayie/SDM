package com.concordia.app.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.concordia.app.vo.CarCatalogue;
import com.concordia.app.vo.CarReturn;



public interface ICarDetails {
	
	 List<CarCatalogue> all() ;
	 CarCatalogue getVehicleDetails(String licensePlate);
	 void updateAvailability(String availability, String licenseNumber);
	 List<CarReturn> getRentedVehicles() ;
	

}
