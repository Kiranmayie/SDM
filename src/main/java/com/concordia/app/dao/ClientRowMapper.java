package com.concordia.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import com.concordia.app.vo.client;

@Component
public class ClientRowMapper implements RowMapper<client>{

	@Override
	public client mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		client client = new client();
		
		client.setClientDL(rs.getString("clientDL"));
		client.setExpDate(rs.getDate("expDate"));
		client.setPhoneNum(rs.getString("phoneNumber"));
		client.setFirstName(rs.getString("firstName"));
		client.setLastName(rs.getString("lastName"));
		return client;
	}
	
	
	
	
	

}
