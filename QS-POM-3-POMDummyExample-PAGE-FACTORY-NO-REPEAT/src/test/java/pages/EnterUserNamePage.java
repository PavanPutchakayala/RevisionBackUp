package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterUserNamePage extends BasePage {

	public EnterUserNamePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = Constants.LOGIN_ID)
	WebElement loginUsername;

	@FindBy(id = Constants.NEXT_BUTTON)
	WebElement nextButton;

	public void submitUsername(String userid) {
		loginUsername.sendKeys(userid);
		nextButton.click();
	}

}
