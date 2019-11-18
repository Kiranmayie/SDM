package com.concordia.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.concordia.app.vo.transaction;

@Repository
public class ReservationDAO implements IReservation{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ReservationRowMapper reservationRowMapper;
	
	private String insertQuery = "insert into carrental.tbltranres(reservationId, startDate, dueDate, clientDL, LicenseNum, carStatus) values (?,?,?,?,?,?)";
	
	private String selectQuery = "select * from carrental.tbltranres where reservationId=?";
	
	private String selectQueryStatus = "select * from carrental.tbltranres where carStatus =?";

	private String selectAll = "select * from carrental.tbltranres";
	@Override
	public void add(transaction transaction) {
		// TODO Auto-generated method stub
		
		int noOfRows = jdbcTemplate.update(insertQuery,transaction.getReservationId(),transaction.getStartdate(),transaction.getLicenseNumber(),transaction.getLicensePlate(),transaction.getStatus());
		
		if(noOfRows == 1) {
			System.out.println("Record added succesfully");
		}
	}

	@Override
	public transaction findById(int reservationId) {
		// TODO Auto-generated method stub
		transaction transaction = jdbcTemplate.queryForObject(selectQuery, reservationRowMapper, reservationId);
		return transaction;
	}

	@Override
	public transaction findByStatus(String status) {
		// TODO Auto-generated method stub
		transaction transaction = jdbcTemplate.queryForObject(selectQueryStatus, reservationRowMapper, status);
		return transaction;
		
		//return null;
	}

	@Override
	public List<transaction> findReservation() {
		// TODO Auto-generated method stub
	//	jdbcTemplate.queryForObject(selectAll, reservationRowMapper, args);
		
		return null;
	}

	@Override
	public void delete(int reservationId) {
		// TODO Auto-generated method stub
		
	}
}
