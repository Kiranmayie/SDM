package com.concordia.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.concordia.app.vo.login;

@Repository
public class loginDAO implements Ilogin {
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	@Autowired
	private loginRowMapper loginRowMapper;
	
	private String selectQuery ="select * from carrental.tbllogin where userId=?";
	private String selectQuery1 = "select * from carrental.tbllogin where userName=?";

	@Override
	public login findById(int id) {
		// TODO Auto-generated method stub
		login login= jdbcTemplate.queryForObject(selectQuery, loginRowMapper, id);
		
		return login;
	}

	@Override
	public login loginUser(String userName) {
		try {

			login login1= jdbcTemplate.queryForObject(selectQuery1, loginRowMapper, userName);
			return login1;
			
		} catch (Exception e) {
			return null;
		}
	}
	}

	
	
	
	
