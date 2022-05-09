package testcases_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	WebDriver driver;
	
	public void openBrowser() {
		driver = new ChromeDriver();
		String url = "https://ie.yahoo.com/";
		driver.get(url);
	}
}
