package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public EnterUserNamePage goToLoginPage(WebDriver driver) {
		driver.findElement(By.cssSelector("a.zh-login")).click();
		return new EnterUserNamePage();
	}
}
