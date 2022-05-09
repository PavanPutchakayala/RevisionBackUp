package com.zoho.tests;

import org.testng.annotations.Test;

import com.zoho.session.ZohoTestSession;

public class LoginTest {

	@Test
	public void loginTest() {

		ZohoTestSession session = new ZohoTestSession();
		//ZohoPage page = session
		
						session
							.init()
							.openBrowser("chrome")
							.goToHomePage()
							.validator().validateTitle();
							//.goToEnterUserNamePage()
							//.submitUserName("test1234@gmail.com");
						

	}

}
