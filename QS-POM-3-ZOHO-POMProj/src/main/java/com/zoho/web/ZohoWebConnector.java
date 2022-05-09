package com.zoho.web;

public interface ZohoWebConnector extends WebConnector	{
	
	void login();
	void logout();
	void validateTitle();
	void validateLogin();
	
	void openBrowser(String bName);
	void navigate(String url);
	void quit();

}
