package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "a.zh-login")
	WebElement loginLink;

	public EnterUserNamePage goToLoginPage() {
		loginLink.click();
		return PageFactory.initElements(driver, EnterUserNamePage.class);
	}
}
