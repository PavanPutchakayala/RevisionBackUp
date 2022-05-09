package com.zoho.base.pages;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage{
	
	//normal Browser Operations
	void openBrowser(String url);
	void quit();
	void getTotalWindows();
	
	//ZOHO Based Normal
	void goToHomePage();
	void goToRegisterPage();
	void submitUserName(String userid);
	void validator();
	
	
	// Zoho Session
	void createDeal();
	void logOut();
	
	

}
