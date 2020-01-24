package com.concordia.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.concordia.app.vo.CarCatalogue;
import com.concordia.app.vo.trans;


@Repository
public class TransactionDAO implements ITransaction {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TransactionRowMapper transactionRowMapper;
	
	private String selectQuery = "select * from carrental.tbltranres where carID=?";
	
	private String selectQuery1 ="SELECT * FROM carrental.tbltranres;";
	
	private String insertQuery = "insert into carrental.tbltranres(startDate, dueDate, clientDL, licensePlate, carStatus) values (?,?,?,?,?)";

	
	//private String updateQuery="update into carrental.tblcar where "
	
	@Override
	public List<trans> getAllTransactions() {
List<trans> list = jdbcTemplate.query(selectQuery1,transactionRowMapper );
		
		return list;
	}
	
	
	@Override
	public trans add(trans tran) {
		// TODO Auto-generated method stub

		int noOfRows = jdbcTemplate.update(insertQuery,tran.getStartdate(),
				tran.getDuedate(), tran.getLicenseNumber(), tran.getLicensePlate(), tran.getStatus());

		if (noOfRows == 1) {

			System.out.println("Record added succesfully");
		}

		return tran;
	}


}
