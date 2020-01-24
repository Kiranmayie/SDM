package com.concordia.app.dao;

import java.util.List;

import com.concordia.app.vo.Client;
import com.concordia.app.vo.clerkLogin;

public interface IClient {
	
	Client add(Client client);
	Client findByname(String lastName);
	
	void update(Client client);
	void delete(String id);
	List<Client> getAllClientDetails();
	Client getClientDetails(String clientId);
	List<Client> getAllName();
	Client findClerkUsers();
	void updateFlag(Client client);
	clerkLogin clerkFlag(String us);
	
	clerkLogin findClerkAddUsers();
	void updateClerkAddFlag(String userName);
	void updateClerkAddFlagFalse(String userName);
	clerkLogin findClerkUpdateUsers();
	void updateClerkUpdateFlagFalse(String userName);
	void updateClerkUpdateFlag(String userName);
	clerkLogin findClerkDeleteUsers();
	void updateClerkDeleteFlag(String userName);
	void updateClerkDeleteFlagFalse(String userName);
	

}
