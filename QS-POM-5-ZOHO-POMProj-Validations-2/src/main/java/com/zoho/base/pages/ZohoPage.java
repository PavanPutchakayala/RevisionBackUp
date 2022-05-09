package com.zoho.base.pages;

import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage{
	
	//normal Browser Operations
	ZohoPage openBrowser(String url);
	ZohoTestSession getSession();
	
	void quit();
	void getTotalWindows();
	
	//ZOHO Based Normal
	ZohoPage goToHomePage();
	ZohoPage goToEnterUserNamePage();
	
	void goToRegisterPage();
	void submitUserName(String userid);
	WebConnector validator();
	
	
	// Zoho Session
	void createDeal();
	void logOut();
	
	

}
