package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterUserNamePage {
	
	WebDriver driver;

	public EnterUserNamePage(WebDriver driver) {
		this.driver = driver;
	}

	public void submitUsername(String userid) {
		driver.findElement(By.id("login_id")).sendKeys(userid);
		driver.findElement(By.id("nextbtn")).click();

	}

}
