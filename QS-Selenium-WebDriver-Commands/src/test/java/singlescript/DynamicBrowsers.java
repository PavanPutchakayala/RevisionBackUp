package singlescript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DynamicBrowsers {
	
	@Test
	public void launch() {
		
		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser.equals("mozilla")) {
			driver = new FirefoxDriver();
		} else if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.medcase.health/");
		System.out.println(driver.getTitle());
	}

}
