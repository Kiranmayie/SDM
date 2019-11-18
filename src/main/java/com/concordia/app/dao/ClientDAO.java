package com.concordia.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;


import com.concordia.app.vo.client;

@Repository
public class ClientDAO implements IClient{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ClientRowMapper clientRowMapper;
	
	private String insertQuery ="insert into carrental.tblClient(clientDL,expDate,phoneNumber,firstName,lastName) values(?,?,?,?,?))";
	
	private String selectQuery= "select * from carrental.tblClient where lastName=? ";
	
	private String selectQuery1 = "select * from carrental.tblClient";
	
	private String deleteQuery= "delete * from carrental.tblClient where clientDL=? ";

	@Override
	public int add(client client) {
		// TODO Auto-generated method stub
		
		//int noOfRows = jdbcTemplate.update(insertQuery,client.getClientDL(),client.getExpDate(),client.getPhoneNum(),client.getFirstName(),client.getLastName());
		
		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		simpleJdbcInsert.withTableName("tblclient").usingGeneratedKeyColumns("clientDL");
		Map<String, Object> parameters = new HashMap<String, Object>(4);
		parameters.put("clientDl", client.getClientDL());
		parameters.put("expDae", client.getExpDate());
		parameters.put("getPhoneNum", client.getPhoneNum());
		parameters.put("getFirstName", client.getFirstName());
		parameters.put("getLastName", client.getLastName());
		Number insertedId = simpleJdbcInsert.executeAndReturnKey(parameters);
		return insertedId.intValue();
		
		
		
			
			//System.out.println("Record added Succesfully");
	}

	@Override
	public client findByname(String lastName) {
		// TODO Auto-generated method stub
		
		client client = jdbcTemplate.queryForObject(selectQuery, clientRowMapper, lastName);
		return client;
	}

	
	@Override
	public void update(client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public client delete(String clientDL) {
		// TODO Auto-generated method stub
		client client1 = jdbcTemplate.queryForObject(deleteQuery, clientRowMapper, clientDL);
		return client1;
	}

	@Override
	public List<client> getAllClientDetails() {

		List<client> list1 =  jdbcTemplate.query(selectQuery1, clientRowMapper); 
		System.out.println(list1);
		return list1;
		
	}

	@Override
	public client getClientDetails(String clientId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
