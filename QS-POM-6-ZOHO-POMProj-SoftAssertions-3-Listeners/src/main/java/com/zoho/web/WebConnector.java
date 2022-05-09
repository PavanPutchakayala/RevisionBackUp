package com.zoho.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.zoho.session.ZohoTestSession;

public interface WebConnector extends ZohoWebConnector{
	
	
	EventFiringWebDriver getCurrentDriver();
	void openBrowser(String bName);
	void navigate(String url);
	void quit();
	
	ZohoTestSession getSession();
	
	boolean isStopExecution();

	void setStopExecution(boolean stopExecution);
	void assertAll();

}
