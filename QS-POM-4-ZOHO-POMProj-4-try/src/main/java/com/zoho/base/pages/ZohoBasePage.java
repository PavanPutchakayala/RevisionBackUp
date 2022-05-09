package com.zoho.base.pages;

import org.testng.Reporter;

import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;

public class ZohoBasePage implements ZohoPage{

	
	public WebConnector getDriver() {
		return getSession().getCon();
	}
	
	public ZohoTestSession getSession() {
		return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}
	
	public ZohoPage openBrowser(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public void getTotalWindows() {
		// TODO Auto-generated method stub
		
	}

	public void goToRegisterPage() {
		// TODO Auto-generated method stub
		
	}

	public void submitUserName(String userid) {
		// TODO Auto-generated method stub
		
	}

	public void validator() {
		// TODO Auto-generated method stub
		
	}


	public void logOut() {
		// TODO Auto-generated method stub
		
	}

	public void createDeal() {
		// TODO Auto-generated method stub
		
	}

	public ZohoPage goToHomePage() {
		// TODO Auto-generated method stub
		return null;
	}

	public ZohoPage goToEnterUserNamePage() {
		// TODO Auto-generated method stub
		return null;
	}

}
