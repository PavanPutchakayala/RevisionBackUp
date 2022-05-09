package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class LaunchPage {

	WebDriver driver;

	public LaunchPage(WebDriver driver) {
		this.driver = driver;
	}

	@SuppressWarnings("deprecation")
	public HomePage navigateToHomePage() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		return new HomePage(driver);
	}

}
