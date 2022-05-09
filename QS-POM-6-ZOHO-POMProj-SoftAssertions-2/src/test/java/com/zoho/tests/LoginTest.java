package com.zoho.tests;

import org.testng.annotations.Test;

import com.zoho.base.pages.Constants;
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
							.validator(false).validateTitle(Constants.HOME_PAGE_TITLE)	//returns HomePage Object
							.validator(false).validateText("xxx","ABC-Sample")
							.validator(false).validateTitle(Constants.HOME_PAGE_TITLE);
							//.goToEnterUserNamePage();
							//.submitUserName("test1234@gmail.com");
						//System.out.println("I am 6-2");
						
						session.end();

	}

}
