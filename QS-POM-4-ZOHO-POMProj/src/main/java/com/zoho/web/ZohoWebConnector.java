package com.zoho.web;

public interface ZohoWebConnector extends WebConnector {

	void logout();
	void validateLogin();
	void validateTitle();
	
	void openBrowser(String bName);
	void navigate(String url);
	void quit();
}
