package com.zoho.base.pages;

import com.zoho.web.WebConnector;

public interface ZohoNormalPage {
	
	//ZOHO Based
	ZohoPage goToHomePage();
	ZohoPage goToEnterUserNamePage();
	
	void goToRegisterPage();
	void submitUserName(String userid);
	WebConnector validator();
	
}
