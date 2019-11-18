package com.concordia.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.concordia.app.vo.login;
import com.concordia.app.vo.transaction;

public class TransactionRowMapper implements RowMapper<transaction>{

	@Override
	public transaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		transaction t=new transaction();
		return t;
	}

}
