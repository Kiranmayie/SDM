package com.concordia.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.concordia.app.vo.CarCatalogue;

@Repository
public class CarCatalogueDAO implements ICarCatalogue {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private CarCatalogueRowMapper carCatalogueRowMapper;
	
	private String insertQuery = "insert into carrental.tblcar(carId, cType, cMake, cModel, cYear, cColor, cLicencePl, cStatus) values (?,?,?,?,?,?,?,?)";
	
	private String selectQuery = "select * from carrental.tblcar where carID=?";
	
	private String selectQuery1 ="select * from carrental.tblcar";
	
	@Override
	public void add(CarCatalogue carCatalogue) {
		// TODO Auto-generated method stub
		
		int noOfRows = jdbcTemplate.update(insertQuery,carCatalogue.getCarId(),carCatalogue.getType(),carCatalogue.getMake(),carCatalogue.getModel(),carCatalogue.getYear(),carCatalogue.getColor(),carCatalogue.getLicenceNum(),carCatalogue.getStatus());
		
		if(noOfRows == 1) {
			System.out.println("Record added succesfully");
		}
	}

	@Override
	public CarCatalogue findById(int id) {
		// TODO Auto-generated method stub
		CarCatalogue carCatalogue = jdbcTemplate.queryForObject(selectQuery, carCatalogueRowMapper, id);
		return carCatalogue;
	}

	
	
	

	@Override
	public void update(CarCatalogue carCatalogue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CarCatalogue> findCarCatalogue() {
		
		List<CarCatalogue> list = jdbcTemplate.query(selectQuery1,carCatalogueRowMapper );
		
		//System.out.println(list);
		return list;
	}
	
	
	

}
