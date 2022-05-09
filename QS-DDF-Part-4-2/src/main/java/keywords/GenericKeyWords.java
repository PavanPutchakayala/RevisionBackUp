package keywords;

import java.time.Duration;
import java.util.Properties;
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
	public Properties prop;
	public Properties envProp;

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
	
	public void navigate(String urlKey) {
		System.out.println("GenericKeyWords navigated to " + urlKey);
		driver.get(envProp.getProperty(urlKey));
	}

	/*
	 * // MODIFICATION - TWO - @ 14:20 - VIDEO - 4_2 1- replace as click(String
	 * locatorKey) 2- getElement((locatorKey)).click();
	 */
	public void click(String locatorKey) {
		System.out.println("Clicking on " + locatorKey);
		getElement((locatorKey)).click();
	}

	public void select(String locator, String data) {
		System.out.println("GenericKeyWords select " + locator + data);
	}

	/*
	 * // MODIFICATION - THREE - @ 14:40 - VIDEO - 4_2 1- replace as click(String
	 * locatorKey) 2- getElement((locatorKey)).click();
	 */
	public void type(String locatorKey, String data) {
		System.out.println("Typing in .. " + locatorKey + " .Data.. " + data);
		getElement((locatorKey)).sendKeys(data);
	}

	public void getText() {

	}

	// Central Function to Extract Elements
	public WebElement getElement(String locatorKey) {
		if (!isElementPresent(locatorKey)) {
			System.out.println("Element Not Present :" + locatorKey);
		}

		if (!isElementVisible(locatorKey)) {
			System.out.println("Element Not Visible :" + locatorKey);
		}

		WebElement element = null;
		if (locatorKey.endsWith("_id"))
			driver.findElement(By.id(prop.getProperty(locatorKey)));
		else if (locatorKey.endsWith("_css"))
			driver.findElement(By.cssSelector(prop.getProperty(locatorKey)));
		else if (locatorKey.endsWith("xpath"))
			driver.findElement(By.xpath(prop.getProperty(locatorKey)));
		else if (locatorKey.endsWith("_name"))
			driver.findElement(By.name(prop.getProperty(locatorKey)));

		return element;
	}

	public boolean isElementPresent(String locatorKey) {
		System.out.println("Checking presence of " + locatorKey);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			if (locatorKey.endsWith("_id"))
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(prop.getProperty(locatorKey))));
			else if (locatorKey.endsWith("_css"))
				wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(prop.getProperty(locatorKey))));
			else if (locatorKey.endsWith("_xpath"))
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty(locatorKey))));
			else if (locatorKey.endsWith("_name"))
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(prop.getProperty(locatorKey))));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean isElementVisible(String locatorKey) {

		System.out.println("Checking visibility of " + locatorKey);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {

			if (locatorKey.endsWith("_id"))
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty(locatorKey))));
			else if (locatorKey.endsWith("_css"))
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(prop.getProperty(locatorKey))));
			else if (locatorKey.endsWith("_xpath"))
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty(locatorKey))));
			else if (locatorKey.endsWith("_name"))
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(prop.getProperty(locatorKey))));

		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
