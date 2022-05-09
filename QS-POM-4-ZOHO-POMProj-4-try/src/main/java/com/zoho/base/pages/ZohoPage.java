package com.zoho.base.pages;

import com.zoho.session.ZohoTestSession;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage{
	
	//normal Browser Operations
	
	ZohoPage openBrowser(String url);
	public ZohoTestSession getSession();
	
	void quit();
	void getTotalWindows();
	
	
	//ZOHO Based Normal
	ZohoPage goToHomePage();
	ZohoPage goToEnterUserNamePage();
	
	void goToRegisterPage();
	void submitUserName(String userid);
	void validator();
	
	
	// Zoho Session
	void createDeal();
	void logOut();
	
	

}
