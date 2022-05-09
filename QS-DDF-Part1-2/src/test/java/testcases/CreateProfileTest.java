package testcases;

import org.testng.annotations.Test;

import keywords.ApplicationKeyWords;

public class CreateProfileTest {

	@Test
	public void createProfileTest() {

		// No WebDriver Ceration Here
		// Login, Create, Verify - Validations

		ApplicationKeyWords app = new ApplicationKeyWords();
		app.openBrowser("chrome");
		app.navigate("http://in.rediff.com");
		app.validateTitle();
		app.validateElementPresent();
		app.type("UN", "Hello");
		app.selectDateFromCalendar();

	}

}
