package com.zoho.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.zoho.listener.ZohoEventListener;

public class ZohoDriver extends ZohoValidationDriver {
	EventFiringWebDriver driver;

	public void login() {
		// TODO Auto-generated method stub

	}

	public void logout() {
		// TODO Auto-generated method stub

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

	public void quit() {
		// TODO Auto-generated method stub

	}

}
