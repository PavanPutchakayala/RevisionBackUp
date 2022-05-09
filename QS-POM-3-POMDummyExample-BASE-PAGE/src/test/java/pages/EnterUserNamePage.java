package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterUserNamePage extends BasePage {

	public EnterUserNamePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "login_id")
	WebElement loginUsername;

	@FindBy(id = "nextbtn")
	WebElement nextButton;

	public void submitUsername(String userid) {
		loginUsername.sendKeys(userid);
		nextButton.click();
	}

}
