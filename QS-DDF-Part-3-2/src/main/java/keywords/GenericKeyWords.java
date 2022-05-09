package keywords;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericKeyWords {

	public WebDriver driver;

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
		getElement(locator).click();
	}

	public void select(String locator, String data) {
		System.out.println("GenericKeyWords select " + locator + data);
	}

	public void type(String locator, String data) {
		System.out.println("Typing in .. " + locator + " .Data.. " + data);
		getElement(locator).sendKeys(data);
	}

	public void getText() {

	}

	// Central Function to Extract Elements
	public WebElement getElement(String locator) {
		// Check the presence
		if (!isElementPresent(locator)) {
			// report failure
			System.out.println("Element Not Present :" + locator);
		}

		// Check the Visibility
		if (!isElementVisible(locator)) {
			// report failure
			System.out.println("Element Not Visible :" + locator);
		}

		WebElement element = driver.findElement(By.id(locator));
		return element;
	}

	public boolean isElementPresent(String locator) {
		System.out.println("Checking presence of " + locator);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean isElementVisible(String locator) {

		System.out.println("Checking visibility of " + locator);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
