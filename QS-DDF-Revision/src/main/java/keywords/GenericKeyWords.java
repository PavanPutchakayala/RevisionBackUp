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
	
	// SECOND MODIFICATION - VIDEO - 4_1
	public Properties envProp;
	

	public void openBrowser(String browser) {
		System.out.println("GenericKeyWords openBrowser Launched" + browser);
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("mozilla")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void navigate(String urlKey) {
		System.out.println("GenericKeyWords navigated to " + urlKey);

		// NINTH MODIFICATION - VIDEO - 4_1	
		driver.get(envProp.getProperty(urlKey));
	}

	public void click(String locatorKey) {
		System.out.println("Clicking on " + locatorKey);
		getElement(locatorKey).click();
	}

	public void select(String locator, String data) {
		System.out.println("GenericKeyWords select " + locator + data);
	}

	public void type(String locatorKey, String data) {
		System.out.println("Typing in .. " + locatorKey + " .Data.. " + data);
		getElement((locatorKey)).sendKeys(data);
	}

	public void getText() {

	}

	// Central Function to Extract Elements
	public WebElement getElement(String locatorKey) {
		// Check the presence
		if (!isElementPresent(locatorKey)) {
			// report failure
			System.out.println("Element Not Present :" + locatorKey);
		}

		// Check the Visibility
		if (!isElementVisible(locatorKey)) {
			// report failure
			System.out.println("Element Not Visible :" + locatorKey);
		}

		WebElement element = driver.findElement(getLocator(locatorKey));
		return element;
	}

	public boolean isElementPresent(String locatorKey) {
		System.out.println("Checking presence of " + locatorKey);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean isElementVisible(String locatorKey) {

		System.out.println("Checking visibility of " + locatorKey);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator(locatorKey)));
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public By getLocator(String locatorKey) {
		
		By by = null;
		
		if(locatorKey.endsWith("_id"))
			by = By.id(prop.getProperty(locatorKey));
		else if(locatorKey.endsWith("_xpath"))
			by = By.xpath(prop.getProperty(locatorKey));		
		else if(locatorKey.endsWith("_css"))
			by = By.cssSelector(prop.getProperty(locatorKey));
		else if(locatorKey.endsWith("_name"))
			by = By.name(prop.getProperty(locatorKey));
		
		return by;
	}
	

}
