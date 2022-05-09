package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.EnterUserNamePage;
import pages.HomePage;
import pages.LaunchPage;

public class LoginTestMy {
	

	@Test
	public void loginTest() {
		WebDriver driver = new ChromeDriver();
		LaunchPage lp = new LaunchPage();
		HomePage hp = lp.navigateToHomePage(driver);
		EnterUserNamePage usernamePage = hp.goToLoginPage(driver);
		usernamePage.submitUsername(driver, "qa.selenium_training@yahoo.com");
	}
}
