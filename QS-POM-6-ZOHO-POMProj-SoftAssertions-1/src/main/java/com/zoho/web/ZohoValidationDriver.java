package com.zoho.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;

public abstract class ZohoValidationDriver implements WebConnector {

	EventFiringWebDriver driver;
	boolean stopExecution;
	SoftAssert softAssert = new SoftAssert();

	public ZohoPage validateTitle(String expTitle) {
		//Assert.assertEquals(driver.getTitle(), expTitle);
		System.out.println("validateTitle Status is "+ isStopExecution());
		return getSession().getCurrentPage();
	}

	public void validateLogin() {
		// TODO Auto-generated method stub

	}

	public ZohoTestSession getSession() {
		return (ZohoTestSession) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}

	public boolean isStopExecution() {
		return stopExecution;
	}

	public void setStopExecution(boolean stopExecution) {
		this.stopExecution = stopExecution;
	}
}
