package com.concordia.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.concordia.app.vo.login;

@Component
public class loginRowMapper implements RowMapper<login> {

	@Override
	public login mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		login login = new login();
		
		login.setUserId(rs.getInt("userId"));
		login.setRole(rs.getString("role"));
		login.setUserName(rs.getString("userName"));
		login.setPassword(rs.getString("Password"));
		
		return login;
		
		
		
		
	}

	

}
