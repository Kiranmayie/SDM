package com.concordia.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.concordia.app.vo.Client;

@Component
public class ClientRowMapper implements RowMapper<Client>{

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Client client = new Client();
		
		client.setClientDL(rs.getString("clientDL"));
		client.setExpDate(rs.getDate("expDate"));
		client.setphoneNumber(rs.getString("phoneNumber"));
		client.setFirstName(rs.getString("firstName"));
		client.setLastName(rs.getString("lastName"));
		return null;
	}
	
	
	
	
	

}
