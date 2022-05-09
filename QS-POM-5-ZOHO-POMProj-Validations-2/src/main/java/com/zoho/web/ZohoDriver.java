package com.zoho.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.zoho.listener.ZohoEventListener;
import com.zoho.session.ZohoTestSession;

public class ZohoDriver extends ZohoValidationDriver {

	public EventFiringWebDriver getCurrentDriver() {
		return driver;
	}

	public void login() {
	}

	public void logout() {
	}

	public void quit() {
	}

	public void openBrowser(String bName) {
		System.out.println("ZohoDriver openBrowser Launched");
		driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new ZohoEventListener());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void navigate(String url) {
		driver.get(url);
	}

	public ZohoTestSession getSession() {
		return (ZohoTestSession) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}

}
