package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage extends BasePage {


	public LaunchPage(WebDriver driver) {
		super(driver);
	}

	@SuppressWarnings("deprecation")
	public HomePage navigateToHomePage() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		//return PageFactory.initElements(driver, HomePage.class);
		return new HomePage(driver);
	}

}
