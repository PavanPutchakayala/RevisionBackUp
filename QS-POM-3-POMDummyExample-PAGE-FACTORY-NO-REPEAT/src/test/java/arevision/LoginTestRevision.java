package arevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestRevision {

	@Test
	public void loginTest() {

		WebDriver driver = new ChromeDriver();

		LaunchPage lp = new LaunchPage(driver);
		HomePage hp = lp.navigateToHomePage();

		EnterUsernamePage userNamePage = hp.goToLoginPage();
		userNamePage.submitUsername("qa.selenium_training@yahoo.com");

	}

}
