package keywords;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class GenericKeyWords {

	public WebDriver driver;
	public Properties prop;
	public Properties envProp;
	public ExtentTest test;
	public SoftAssert softAssert;

	public void openBrowser(String browser) {
		System.out.println("GenericKeyWords openBrowser Launched" + browser);
		log("Opening the Browser.. " + browser);
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("mozilla")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void navigate(String urlKey) {
		log("Navigating to the url .. " + urlKey);
		System.out.println("GenericKeyWords navigated to " + urlKey);

		// NINTH MODIFICATION - VIDEO - 4_1
		driver.get(envProp.getProperty(urlKey));
	}

	public void click(String locatorKey) {
		log("Clicking on " + locatorKey);
		getElement(locatorKey).click();
	}

	public void select(String locator, String data) {
		log("GenericKeyWords select " + locator + data);
	}

	public void type(String locatorKey, String data) {
		log("Typing in .. " + locatorKey + " .Data.. " + data);
		getElement((locatorKey)).sendKeys(data);
	}

	public void getText() {

	}

	// Central Function to Extract Elements
	public WebElement getElement(String locatorKey) {
		// Check the presence
		if (!isElementPresent(locatorKey)) {
			// report failure
			log("Element Not Present :" + locatorKey);
		}

		// Check the Visibility
		if (!isElementVisible(locatorKey)) {
			// report failure
			log("Element Not Visible :" + locatorKey);
		}

		WebElement element = driver.findElement(getLocator(locatorKey));
		return element;
	}

	public boolean isElementPresent(String locatorKey) {
		log("Checking presence of " + locatorKey);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean isElementVisible(String locatorKey) {

		log("Checking visibility of " + locatorKey);
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

		if (locatorKey.endsWith("_id"))
			by = By.id(prop.getProperty(locatorKey));
		else if (locatorKey.endsWith("_xpath"))
			by = By.xpath(prop.getProperty(locatorKey));
		else if (locatorKey.endsWith("_css"))
			by = By.cssSelector(prop.getProperty(locatorKey));
		else if (locatorKey.endsWith("_name"))
			by = By.name(prop.getProperty(locatorKey));

		return by;
	}

	public void log(String msg) {
		System.out.println(msg);
		test.log(Status.INFO, msg);
	}

	public void reportFailure(String failureMsg, boolean stopONFailure) {
		System.out.println(failureMsg);
		test.log(Status.FAIL, failureMsg);
		takeScreenShot();
		softAssert.fail(failureMsg);

		if (stopONFailure) {
			assertAll();
		}
	}

	public void assertAll() {
		Reporter.getCurrentTestResult().getTestContext().setAttribute("Critical Failure", "Y");
		softAssert.assertAll();
	}
	
	public void takeScreenShot(){
		// fileName of the screenshot
		Date d=new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
		// take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			// get the dynamic folder name
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath+"//"+screenshotFile));
			//put screenshot file in reports
			test.log(Status.INFO,"Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+"//"+screenshotFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
