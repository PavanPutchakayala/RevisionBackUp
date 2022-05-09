package keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericKeyWords {

	public WebDriver driver;

	@SuppressWarnings("deprecation")
	public void openBrowser(String browser) {
		System.out.println("GenericKeyWords openBrowser Launched" + browser);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("mozilla")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void navigate(String url) {
		System.out.println("GenericKeyWords navigated to " + url);
		driver.get(url);
	}

	public void click(String locator) {
		System.out.println("Clicking on " + locator);
		driver.findElement(By.id(locator)).click();
	}

	public void select(String locator, String data) {
		System.out.println("GenericKeyWords select " + locator + data);
	}

	public void type(String locator, String data) {
		System.out.println("Typing in .. " + locator + " .Data.. " + data);
		driver.findElement(By.id(locator)).sendKeys(data);
	}

	public void getText() {

	}
}
