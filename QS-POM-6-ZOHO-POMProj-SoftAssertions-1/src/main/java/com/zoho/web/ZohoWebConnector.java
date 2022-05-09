package com.zoho.web;

import com.zoho.base.pages.ZohoPage;

public interface ZohoWebConnector	{
	
	void login();
	void logout();
	ZohoPage validateTitle(String expectedTitle);
	void validateLogin();
	
	void openBrowser(String bName);
	void navigate(String url);
	void quit();

}
