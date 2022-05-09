package com.zoho.web;

public interface WebConnector {

	void openBrowser(String bName);
	void navigate(String url);
	void quit();
}
