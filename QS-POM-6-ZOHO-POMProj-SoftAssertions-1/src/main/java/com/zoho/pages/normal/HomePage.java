package com.zoho.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;

public class HomePage extends ZohoBasePage {
	
	@FindBy(css = Constants.LOGIN_LINK)
	WebElement loginLink;
	
	public ZohoPage gotoEnterUserNamePage() {
		loginLink.click();
		return new EnterUserNamePage();
	}
	

}
