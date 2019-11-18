package com.concordia.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.concordia.app.vo.CarCatalogue;
import com.concordia.app.vo.transaction;

public class TransactionDAO implements ITransaction {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TransactionRowMapper transactionRowMapper;
	
	
	
	private String selectQuery = "select * from carrental.tbltransres where carID=?";
	
	private String selectQuery1 ="select * from carrental.tbltransres";
	
	//private String updateQuery="update into carrental.tblcar where "
	
	@Override
	public List<transaction> getAllTransactions() {
List<transaction> list = jdbcTemplate.query(selectQuery1,transactionRowMapper );
		
		return list;
	}

}
