package testcases.rediff;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testbase.BaseTest;

public class Session extends BaseTest {
	
	@Test
	public void doLogin(ITestContext context) {
		//test.log(Status.INFO, "..Login...");
		app.log("..Login..");
		app.openBrowser("chrome");
		app.navigate("url");
		app.type("username_css", "automation.architect@rediffmail.com");
		app.reportFailure("Test is Incorrect...");
		app.type("password_xpath", "Explore@999");
		app.validateElementPresent("login_submit_id");
		app.click("login_submit_id");
		app.validateLogin();
		
	}
	
	@Test
	public void doLogout() {
		test.log(Status.INFO, "..LogOut...");
	}

}
