package zoho.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.zoho.listener.ZohoEventListener;

public class LoginTest_1 {
	
	//Demo of EventFiringWebDriver - Which is useful for VALIDATIONS

	@Test
	public void loginTest() {
		
		EventFiringWebDriver driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new ZohoEventListener());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://zoho.com");
		
		driver.findElement(By.cssSelector("a.zh-login")).click();

	}
}
