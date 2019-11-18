package com.concordia.app.dao;

import java.util.List;

import com.concordia.app.vo.client;

public interface IClient {
	
	int add(client client);
	client findByname(String lastName);
	
	void update(client client);
	client delete(String clientDL);
	List<client> getAllClientDetails();
	client getClientDetails(String clientId);

}
