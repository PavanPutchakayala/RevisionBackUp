package com.zoho.tests;

import org.testng.annotations.Test;

import com.zoho.base.pages.ZohoPage;
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
							.goToEnterUserNamePage();

	}

}
