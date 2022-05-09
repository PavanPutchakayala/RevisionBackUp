package testcases.rediff;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import keywords.ApplicationKeyWords;
import testbase.BaseTest;

public class Session extends BaseTest {
	
	@Test
	public void doLogin(ITestContext context) {
		System.out.println("..Login...");
		app.openBrowser("Chrome");
		
	}
	
	@Test
	public void doLogout() {
		System.out.println("..LogOut...");
	}

}
