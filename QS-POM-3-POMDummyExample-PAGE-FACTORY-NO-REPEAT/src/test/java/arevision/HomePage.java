package arevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css= Constants.SIGNIN_LINK)
	WebElement loginLink;
	
	public EnterUsernamePage goToLoginPage() {
		//Click on SignIN link
		loginLink.click();
		
		return new EnterUsernamePage(driver);
	}
	
}
