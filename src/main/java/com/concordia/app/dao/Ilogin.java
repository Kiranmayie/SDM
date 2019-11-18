package com.concordia.app.dao;

import com.concordia.app.vo.login;

public interface Ilogin {
	
	login findById(int id);
	login loginUser(String userName);
	

}
