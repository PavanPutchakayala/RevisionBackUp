package com.zoho.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;

public class EnterUsernamePage extends ZohoBasePage {

	@FindBy(id = Constants.LOGIN_ID)
	WebElement loginUsername;

	@FindBy(xpath = Constants.NEXT_BUTTON)
	WebElement nextButton;

	public ZohoPage submitUsername(String userid) {
		loginUsername.sendKeys(userid);
		nextButton.click();

		return new EnterPasswordPage();

	}

}
