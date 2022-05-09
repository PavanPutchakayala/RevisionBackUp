package testcases;

import org.testng.annotations.Test;

import keywords.ApplicationKeyWords;

public class CreateProfileTest {

	@Test
	public void createProfileTest() {
		
		ApplicationKeyWords app = new ApplicationKeyWords();
		
			app.openBrowser("chrome");
			app.navigate("url");
			app.type("username", "automation.architect@rediffmail.com");
			app.type("password", "Explore@999");
			app.validateElementPresent("login_submit");
			app.click("login_submit");
			System.out.println("I am @ 3-3-PROPERTIES-MULTIPLE-Files");
		
	}

}
