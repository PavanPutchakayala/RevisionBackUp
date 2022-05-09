package com.zoho.pages.normal;

import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;

public class LaunchPage extends ZohoBasePage {

	public ZohoPage openBrowser(String bName) {
		/*
		ZohoTestSession session = getSession();
		session.getCon().openBrowser("chrome");
		System.out.println("LaunchPage openBrowser called");
		*/
		getDriver().openBrowser("chrome");
		return this;
	}
	
	public void goToHomePage() {
		/*
		ZohoTestSession session = getSession();
		session.getCon().navigate("https://zoho.com");
		System.out.println("goToHomePage @ LaunchPage Called");	
		*/
		getDriver().navigate("https://zoho.com");
	}
}
