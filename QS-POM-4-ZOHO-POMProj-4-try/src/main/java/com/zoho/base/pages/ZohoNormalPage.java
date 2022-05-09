package com.zoho.base.pages;

public interface ZohoNormalPage {
	
	//ZOHO Based
	
	ZohoPage goToHomePage();
	ZohoPage goToEnterUserNamePage();

	void goToRegisterPage();
	void submitUserName(String userid);
	void validator();
	
}
