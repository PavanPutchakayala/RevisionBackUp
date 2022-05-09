package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.EnterUserNamePage;
import pages.HomePage;
import pages.LaunchPage;

public class LoginTest {

	@SuppressWarnings("deprecation")
	@Test
	public void loginTest() {
		WebDriver driver = new ChromeDriver();
		
		LaunchPage lp = new LaunchPage(driver);
		//LaunchPage lp = PageFactory.initElements(driver, LaunchPage.class);
		
		HomePage hp = lp.navigateToHomePage();

		EnterUserNamePage usernamePage = hp.goToLoginPage();
		usernamePage.submitUsername("qa.selenium_training@yahoo.com");

	}
}
