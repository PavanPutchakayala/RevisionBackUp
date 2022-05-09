package com.zoho.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;

public abstract class ZohoValidationDriver implements WebConnector {

	EventFiringWebDriver driver;

	public ZohoPage validateTitle(String expTitle) {
		Assert.assertEquals(driver.getTitle(), expTitle);
		return getSession().getCurrentPage();
	}

	public void validateLogin() {
		// TODO Auto-generated method stub

	}

	public ZohoTestSession getSession() {
		return (ZohoTestSession) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}
}
