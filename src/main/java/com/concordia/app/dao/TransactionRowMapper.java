package com.concordia.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.concordia.app.vo.login;
import com.concordia.app.vo.trans;


@Component
public class TransactionRowMapper implements RowMapper<trans>{

	@Override
	public trans mapRow(ResultSet rs, int rowNum) throws SQLException {
		trans tran=new trans();
		tran.setReservationId(rs.getInt("reservationId"));
		tran.setStartdate(rs.getDate("startDate"));
		tran.setDuedate(rs.getDate("dueDate"));
		tran.setLicenseNumber(rs.getString("clientDL"));
		tran.setLicensePlate(rs.getString("licensePlate"));
		tran.setStatus(rs.getString("carStatus"));
		tran.setFlag(rs.getBoolean("flag"));
		return tran;
	}

}
