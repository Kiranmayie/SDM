package com.concordia.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.concordia.app.vo.transaction;

public class transactionRowMapper implements RowMapper<transaction> {

	
	@Override
	public transaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		
		transaction tr = new transaction();
		
		tr.setReservationId(rs.getInt("reservationId"));
		tr.setStartdate(rs.getDate("startdate"));
		tr.setDuedate(rs.getDate("duedate"));
		tr.setLicenseNumber(rs.getString("licenseNumber"));
		tr.setLicensePlate(rs.getString("licensePlate"));
		tr.setStatus(rs.getString("status"));
		
		return tr;
		
		
		
		
	}
}
