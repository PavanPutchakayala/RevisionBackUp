package testcases.rediff;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import keywords.ApplicationKeyWords;
import testbase.BaseTest;

public class Session extends BaseTest {
	
	@Test
	public void doLogin(ITestContext context) {
		test.log(Status.INFO, "..Login...");
		app.openBrowser("Chrome");
		
	}
	
	@Test
	public void doLogout() {
		test.log(Status.INFO, "..LogOut...");
	}

}
