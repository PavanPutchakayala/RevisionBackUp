package com.zoho.pages.normal;

import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;

public class LaunchPage extends ZohoBasePage {

	public ZohoPage openBrowser(String bName) {
		/*
		ZohoTestSession session = getSession();
		session.getCon().openBrowser("chrome");
		*/
		getDriver().openBrowser("chrome");
		return this;
	}
	
	public ZohoPage goToHomePage() {
		/*
		ZohoTestSession session = getSession();
		session.getCon().navigate("https://zoho.com");
		*/
		getDriver().navigate("https://zoho.com");
		return new HomePage();
	}
}
