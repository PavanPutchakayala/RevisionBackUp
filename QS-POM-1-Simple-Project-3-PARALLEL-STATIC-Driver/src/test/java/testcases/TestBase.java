package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	//********************************************	
	//Its a MISTAKE to declare WebDriver as STATIC
	//********************************************
	
	public static WebDriver driver;
	
	public void openBrowser() {
		driver = new ChromeDriver();
		String url = "https://ie.yahoo.com/";
		driver.get(url);
	}
}
