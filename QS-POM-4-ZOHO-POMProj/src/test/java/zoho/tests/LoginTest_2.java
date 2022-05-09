package zoho.tests;

import org.testng.annotations.Test;

import com.zoho.base.pages.ZohoPage;
import com.zoho.pages.normal.LaunchPage;

public class LoginTest_2 {

	// Demo - How to Create an Object in V-Structure

	@Test
	public void loginTest() {

		ZohoPage page = new LaunchPage();
		page.gotoHomePage();

	}
}
