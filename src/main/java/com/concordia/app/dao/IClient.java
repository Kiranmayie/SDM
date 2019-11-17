package com.concordia.app.dao;

import java.util.List;

import com.concordia.app.vo.Client;

public interface IClient {
	
	void add(Client client);
	Client findByname(String lastName);
	List<Client> findClient();
	void update(Client client);
	void delete(String clientDL);

}
