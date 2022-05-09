package arevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterUsernamePage extends BasePage {

	public EnterUsernamePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = Constants.USER_ID)
	WebElement username;

	@FindBy(id = Constants.NEXT_BTN)
	WebElement nextbtn;

	public void submitUsername(String userid) {
		username.sendKeys(userid);
		nextbtn.click();

	}

}
