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
		// Assert.assertEquals(driver.getTitle(), expTitle);
		System.out.println("validateTitle Status is " + isStopExecution());

		if (!expTitle.equals(driver.getTitle())) {
			softAssert.fail("Title do not match: " + driver.getTitle());
			if (isStopExecution())
				softAssert.assertAll();
		}
		// return back the Current Page object
		return getSession().getCurrentPage();
	}

	@Override
	public ZohoPage validateText(String locator, String expectedText) {

		String actualText = "ABC-Sample";
		if (!expectedText.equals(actualText)) {
			softAssert.fail("Text Not matching: " + actualText);
			if (isStopExecution())
				softAssert.assertAll();
		}

		System.out.println("validateText Status is " + isStopExecution());
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
	
	public void assertAll() {
		softAssert.assertAll();
	}
}
