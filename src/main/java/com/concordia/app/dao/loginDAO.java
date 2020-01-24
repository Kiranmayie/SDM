package com.concordia.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.concordia.app.vo.CarCatalogue;
import com.concordia.app.vo.clerkLogin;
import com.concordia.app.vo.login;

@Repository
public class loginDAO implements Ilogin {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private loginRowMapper loginRowMapper;
	
	@Autowired
	private clerkLoginRowMapper clerkLoginRowMapper;

	private String selectQuery = "select * from carrental.tbllogin where userId=?";
	private String selectQuery1 = "select * from carrental.tbllogin where userName=?";
	private String selectFlag = "select * from carrental.tbllogin where flag=?";
	private String updateFlag1="update carrental.tbllogin set flag=? where userId=?";
	private String updateFlag2="update carrental.tbllogin set flag=? where userName=?";
	private String selectclerkQuery="select * from carrental.tblclerklogin where userName=?";
	
	private String ClerkFlag="update carrental.tblclerklogin set flag=? where userName=?";

	@Override
	public login findById(int id) {
		// TODO Auto-generated method stub
		login login = jdbcTemplate.queryForObject(selectQuery, loginRowMapper, id);

		return login;
	}

	@Override
	public login loginUser(String userName) {
		try {

			login login1 = jdbcTemplate.queryForObject(selectQuery1, loginRowMapper, userName);
			return login1;

		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public login findAdminUsers() {
		boolean flag = true;
		login login1 = null;

		try {
			login1 = jdbcTemplate.queryForObject(selectFlag, loginRowMapper, flag);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return login1;
	}

	@Override
	public void updateFlag(login user) {
		jdbcTemplate.update(updateFlag1, user.isFlag(), user.getUserId());
		
		System.out.println(user.isFlag());
		
	}
	
	
	
	@Override
	public void settingClerkFlag(String user) {
		jdbcTemplate.update(ClerkFlag,true,user);
		
		//System.out.println(user.isFlag());
		
	}

	@Override
	public void updateFlag(String userName) {
       jdbcTemplate.update(updateFlag2, false,userName);
		
	}

	@Override
	public clerkLogin loginclerkUser(String us) {
	
		
		clerkLogin login1 = null;

		try {
			login1 = jdbcTemplate.queryForObject(selectclerkQuery, clerkLoginRowMapper, us);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return login1;
		
			

		
	}

	
	
}
