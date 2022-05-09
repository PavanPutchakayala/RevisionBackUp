package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class LaunchPage {

	@SuppressWarnings("deprecation")
	public HomePage navigateToHomePage(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		return new HomePage();
	}

}
