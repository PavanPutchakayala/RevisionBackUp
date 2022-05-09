package arevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class LaunchPage extends BasePage{

	public LaunchPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage navigateToHomePage() {
		//Code for Launching the Browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		return new HomePage(driver);
	}
}
