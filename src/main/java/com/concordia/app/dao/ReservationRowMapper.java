package com.concordia.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

//import com.concordia.app.vo.CarCatalogue;
import com.concordia.app.vo.transaction;

@Component
public class ReservationRowMapper implements RowMapper<transaction> {
	
	@Override
	public transaction mapRow(ResultSet resultSet, int rowNo) throws SQLException {
		// TODO Auto-generated method stub
		transaction trans = new transaction();
		
		trans.setReservationId(resultSet.getInt("reservationId"));
		trans.setStartdate(resultSet.getDate("startDate"));
		trans.setDuedate(resultSet.getDate("dueDate"));
		trans.setLicenseNumber(resultSet.getString("LicenseNum"));
		trans.setLicensePlate(resultSet.getString("licensePlate"));
		trans.setStatus(resultSet.getString("carStatus"));
		
		
		
		return trans;
}
}
