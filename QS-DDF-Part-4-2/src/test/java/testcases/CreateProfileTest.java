package testcases;

import org.testng.annotations.Test;

import keywords.ApplicationKeyWords;

public class CreateProfileTest {

	@Test
	public void createProfileTest() {
		
		ApplicationKeyWords app = new ApplicationKeyWords();
		
			app.openBrowser("chrome");
			app.navigate("url");
			app.type("username_css", "automation.architect@rediffmail.com");
			app.type("password_xpath", "Explore@999");
			app.validateElementPresent("login_submit");
			app.click("login_submit_id");
			app.validateLogin();
			System.out.println("I am @ 4-2");
		
	}

}
