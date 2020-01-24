 	package com.concordia.app.dao;

import com.concordia.app.vo.clerkLogin;
import com.concordia.app.vo.login;

public interface Ilogin {
	
	login findById(int id);
	login loginUser(String userName);
	login findAdminUsers();
	void updateFlag(login user);
	void updateFlag(String userName);
	clerkLogin loginclerkUser(String us);
	
	void settingClerkFlag(String user);
	

}
