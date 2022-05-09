package com.zoho.base.pages;

import com.zoho.session.ZohoTestSession;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage{
	
	//normal Browser Operations
	ZohoPage openBrowser(String url);
	void quit();
	void getTotalWindows();
	
	public ZohoTestSession getSession();
	
	//ZOHO Based Normal
	void goToHomePage();
	void goToRegisterPage();
	void submitUserName(String userid);
	void validator();
	
	
	// Zoho Session
	void createDeal();
	void logOut();
	
	

}
