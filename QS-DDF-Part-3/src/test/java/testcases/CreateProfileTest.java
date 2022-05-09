package testcases;

import org.testng.annotations.Test;

import keywords.ApplicationKeyWords;

public class CreateProfileTest {

	@Test
	public void createProfileTest() {
		
		ApplicationKeyWords app = new ApplicationKeyWords();
		
			app.openBrowser("chrome");
			app.navigate("https://portfolio.rediff.com/portfolio-login");
			app.type("useremail", "automation.architect@rediffmail.com");
			app.type("userpass", "Explore@999");
			app.click("loginsubmit");

		
	}

}
