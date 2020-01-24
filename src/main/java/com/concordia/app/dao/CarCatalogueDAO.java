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

	private String selectQuery = "select * from carrental.tblcar where carId=?";

	private String selectQuery1 = "select * from carrental.tblcar";

	private String updateQuery = "update carrental.tblcar set cType = ?, cMake = ?, cModel = ?, cYear = ?, cColor = ?, cLicencePl = ?, cStatus = ? where carId = ?";

	private String deleteQuery ="delete from carrental.tblcar where carId=?";
	
	private String updateRented="update carrental.tblcar set cStatus=? where cLicencePl = ?";
	
	private String updateAvailable="update carrental.tblcar set cStatus=? where cLicencePl = ?";
	@Override
	public CarCatalogue add(CarCatalogue carCatalogue) {
		// TODO Auto-generated method stub

		int noOfRows = jdbcTemplate.update(insertQuery, carCatalogue.getCarId(), carCatalogue.getType(),
				carCatalogue.getMake(), carCatalogue.getModel(), carCatalogue.getYear(), carCatalogue.getColor(),
				carCatalogue.getLicenceNum(), carCatalogue.getStatus());

		if (noOfRows == 1) {

			System.out.println("Record added succesfully");
		}

		return carCatalogue;
	}

	@Override
	public CarCatalogue findById(int id) {
		// TODO Auto-generated method stub
		CarCatalogue carCatalogue = jdbcTemplate.queryForObject(selectQuery, carCatalogueRowMapper, id);
		return carCatalogue;
	}

	@Override
	public void update(CarCatalogue carCatalogue) {

		System.out.println(carCatalogue.getStatus());

		jdbcTemplate.update(updateQuery, carCatalogue.getType(), carCatalogue.getMake(), carCatalogue.getModel(),
				carCatalogue.getYear(), carCatalogue.getColor(), carCatalogue.getLicenceNum(), carCatalogue.getStatus(),
				carCatalogue.getCarId());

	}

	@Override
	public void delete(int id) {
		
		jdbcTemplate.update(deleteQuery,id);

	}

	@Override
	public List<CarCatalogue> findCarCatalogue() {

		List<CarCatalogue> list = jdbcTemplate.query(selectQuery1, carCatalogueRowMapper);

		// System.out.println(list);
		return list;
	}
	
	@Override
	public void updateRented(String licenseNum) {

		jdbcTemplate.update(updateRented,"NotAvailable",licenseNum);

	}

	@Override
	public void updateReserved(String licenseNum) {
		jdbcTemplate.update(updateRented,"Reserved",licenseNum);
		
	}
	
	@Override
	public void updateAvailable(String licenseNum) {
		jdbcTemplate.update(updateAvailable,"Available",licenseNum);
		System.out.println("thus");
		
	}

}
