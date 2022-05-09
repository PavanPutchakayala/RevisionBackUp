package login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void login() {
		WebDriver driver = launchBrowser("chrome");
		driver.get("https://www.monster.ie/");
	}
}
