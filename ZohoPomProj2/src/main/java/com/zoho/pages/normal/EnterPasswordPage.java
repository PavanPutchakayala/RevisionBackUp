package com.zoho.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;

public class EnterPasswordPage extends ZohoBasePage{

	@FindBy(id=Constants.PASSWORD)
	WebElement loginPassword;
	
	@FindBy(xpath=Constants.SIGNIN_BUTTON)
	WebElement nextButton;
	
	public ZohoPage submitPassword(String password) {
		loginPassword.sendKeys(password);
		nextButton.click();
		
		return null;
		
	}
}
