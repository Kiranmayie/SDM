package com.concordia.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.concordia.app.vo.Client;

@Repository
public class ClientDAO implements IClient{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ClientRowMapper clientRowMapper;
	
	private String insertQuery ="insert into carrental.tblClient(clientDL,expDate,phoneNumber,firstName,lastName) values(?,?,?,?,?))";
	
	private String selectQuery= "select * from carrental.tblClient where lastName=? ";
	
	private String selectQuery1 = "select * from carrental.tblClient";

	@Override
	public void add(Client client) {
		// TODO Auto-generated method stub
		
		int noOfRows = jdbcTemplate.update(insertQuery,client.getClientDL(),client.getExpDate(),client.getphoneNumber(),client.getFirstName(),client.getLastName());
		
		if(noOfRows ==1)
			System.out.println("Record added Succesfully");
	}

	@Override
	public Client findByname(String lastName) {
		// TODO Auto-generated method stub
		
		Client client = jdbcTemplate.queryForObject(selectQuery, clientRowMapper, lastName);
		return client;
	}

	@Override
	public List<Client> findClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String clientDL) {
		// TODO Auto-generated method stub
		
	}
	

}
