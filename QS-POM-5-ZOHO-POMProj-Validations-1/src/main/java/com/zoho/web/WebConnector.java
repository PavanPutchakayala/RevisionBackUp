package com.zoho.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;

public interface WebConnector {
	
	
	EventFiringWebDriver getCurrentDriver();
	void openBrowser(String bName);
	void navigate(String url);
	void quit();

}
