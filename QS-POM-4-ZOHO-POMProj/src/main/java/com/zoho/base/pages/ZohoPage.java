package com.zoho.base.pages;

public interface ZohoPage extends ZohoNormal, ZohoSession{
	
	//Normal Browser Operations
	void openBrowser(String browser);
	void quit();
	void getTotalWindows();
	
	//Zoho Based
	void gotoHomePage();
	void gotoRegisterPage();
	void submitUsername(String userid);
	void validator();
	
	//zoho session()
	void createDeal();
	void logOut();
	

}
