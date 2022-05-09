package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterUserNamePage {

	public void submitUsername(WebDriver driver, String userid) {
		driver.findElement(By.id("login_id")).sendKeys(userid);
		driver.findElement(By.id("nextbtn")).click();

	}

}
