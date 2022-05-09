package com.zoho.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.zoho.listener.ZohoEventListener;
import com.zoho.session.ZohoTestSession;

@SuppressWarnings("deprecation")
public class LoginTest2 {

	@Test
	public void loginTest() {
		
		// 1 - driver object
		// 1 - reporting object
		// 1 - ZohoSession

		ZohoTestSession session = new ZohoTestSession();
		session.init();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new ZohoEventListener());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://zoho.com");
		driver.findElement(By.cssSelector("a.zh-login")).click();

	}

}
