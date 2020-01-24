package com.concordia.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.concordia.app.vo.CarCatalogue;

@Component
public class CarCatalogueRowMapper implements RowMapper<CarCatalogue> {

	@Override
	public CarCatalogue mapRow(ResultSet resultSet, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		CarCatalogue carCatalogue = new CarCatalogue();
		
		carCatalogue.setCarId(resultSet.getInt("carId"));
		carCatalogue.setType(resultSet.getString("cType"));
		carCatalogue.setMake(resultSet.getString("cMake"));
		carCatalogue.setModel(resultSet.getString("cModel"));
		carCatalogue.setYear(resultSet.getString("cYear"));
		carCatalogue.setColor(resultSet.getString("cColor"));
		carCatalogue.setLicenceNum(resultSet.getString("cLicencePl"));
		carCatalogue.setStatus(resultSet.getString("cStatus"));
		carCatalogue.setFlag(resultSet.getBoolean("flag"));

		
		return carCatalogue;
	}

	

}
