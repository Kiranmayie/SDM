package com.concordia.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.concordia.app.vo.Client;
import com.concordia.app.vo.clerkLogin;
import com.concordia.app.vo.login;

@Repository
public class ClientDAO implements IClient{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private clerkLoginRowMapper clerkloginRowMapper;
	
	
	@Autowired
	private ClientRowMapper clientRowMapper;
	
	private String insertQuery ="insert into carrental.tblClient(clientDL,expDate,phoneNumber,firstName,lastName) values(?,?,?,?,?)";
	
	private String selectQuery= "select * from carrental.tblClient where clientDL=? ";
	
	private String selectQuery1 = "select * from carrental.tblClient";
	
	private String selectClientName = "select clientDL from carrental.tblClient";

	private String updateQuery="update carrental.tblClient set expDate = ?, phoneNumber = ?, firstName = ?, lastName = ? where clientDL = ?";

	private String deleteQuery ="delete from carrental.tblClient where clientDL=?";
	
	private String selectFlag = "select * from carrental.tblClient where flag=?";
	
	private String updateFlag1="update carrental.tblClient set flag=? where clientDL=?";
	
	private String getClerkFlag = "select * from carrental.tblclerklogin where userName=?";
	
	private String getClerkAddFlag = "select * from carrental.tblclerklogin where AddFlag=?";
	
	private String updateAddFlag="update carrental.tblclerklogin set Addflag=? where userName=?";
	
	private String getClerkUpdateFlag="select * from carrental.tblclerklogin where Updateflag=?";
	
	private String updateUpdateFlag="update carrental.tblclerklogin set Updateflag=? where userName=?";
	
	private String getClerkDeleteFlag="select * from carrental.tblclerklogin where DeleteFlag=?";
	
	private String updateDeleteFlag="update carrental.tblclerklogin set DeleteFlag=? where userName=?";
	
	
	
			
			@Override
	public Client add(Client client) {
		// TODO Auto-generated method stub
		
		int noOfRows = jdbcTemplate.update(insertQuery,client.getClientDL(),client.getExpDate(),client.getPhoneNumber(),client.getFirstName(),client.getLastName());
		
		if(noOfRows ==1)
			
			System.out.println("Record added Succesfully");
		
		return client;
	}

	@Override
	public Client findByname(String clientDL) {
		// TODO Auto-generated method stub
		
		Client client = jdbcTemplate.queryForObject(selectQuery, clientRowMapper, clientDL);
		return client;
	}

	
	
	@Override
	public clerkLogin clerkFlag(String us) {
		// TODO Auto-generated method stub
		
		clerkLogin client = jdbcTemplate.queryForObject(selectQuery, clerkloginRowMapper, us);
		return client;
	}

	
	@Override
	public void update(Client client) {
		jdbcTemplate.update(updateQuery,client.getExpDate(),client.getPhoneNumber(),client.getFirstName(),client.getLastName(),client.getClientDL());
		
		
	}

	
	@Override
	public List<Client> getAllClientDetails() {

		List<Client> list1 =  jdbcTemplate.query(selectQuery1, clientRowMapper); 
		System.out.println(list1);
		return list1;
		
	}
	
	
	
	
	@Override
	public List<Client> getAllName() {

		List<Client> list2 =  jdbcTemplate.query(selectClientName, clientRowMapper); 
		System.out.println(list2);
		return list2;
		
	}

	@Override
	public Client getClientDetails(String clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(deleteQuery,id);
	}

	@Override
	public Client findClerkUsers() {
		boolean flag = true;
		Client client = null;

		try {
			client = jdbcTemplate.queryForObject(selectFlag, clientRowMapper, flag);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return client;
	}

	@Override
	public void updateFlag(Client client) {
		jdbcTemplate.update(updateFlag1, client.isFlag(), client.getClientDL());
		
		System.out.println(client.isFlag());
		
		
	}
	
	
	
	@Override
	public clerkLogin findClerkAddUsers() {
	
		
		clerkLogin login1 = null;

		try {
			login1 = jdbcTemplate.queryForObject(getClerkAddFlag, clerkloginRowMapper,true);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return login1;
		
			

		
	}

	@Override
	public void updateClerkAddFlag(String userName) {
		jdbcTemplate.update(updateAddFlag, true, userName);		
	}

	@Override
	public void updateClerkAddFlagFalse(String userName) {
		jdbcTemplate.update(updateAddFlag, false, userName);	
		
	}

	@Override
	public clerkLogin findClerkUpdateUsers() {

		clerkLogin login1 = null;

		try {
			login1 = jdbcTemplate.queryForObject(getClerkUpdateFlag, clerkloginRowMapper,true);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return login1;
		
			

	}

	@Override
	public void updateClerkUpdateFlag(String userName) {
		jdbcTemplate.update(updateUpdateFlag, true, userName);	
		System.out.println("this");
		System.out.println(userName);
	}

	@Override
	public void updateClerkUpdateFlagFalse(String userName) {
		jdbcTemplate.update(updateUpdateFlag, false, userName);	
		
	}
	

	@Override
	public clerkLogin findClerkDeleteUsers() {

		clerkLogin login1 = null;

		try {
			login1 = jdbcTemplate.queryForObject(getClerkDeleteFlag, clerkloginRowMapper,true);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return login1;
		
			

	}

	@Override
	public void updateClerkDeleteFlag(String userName) {
		jdbcTemplate.update(updateDeleteFlag, true, userName);		
	}

	@Override
	public void updateClerkDeleteFlagFalse(String userName) {
		jdbcTemplate.update(updateDeleteFlag, false, userName);	
		
	}

	

}
