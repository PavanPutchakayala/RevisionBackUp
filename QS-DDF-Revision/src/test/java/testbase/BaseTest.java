package testbase;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeyWords;

public class BaseTest {

	public ApplicationKeyWords app;

	@BeforeTest(alwaysRun = true)
	public void beforeTest(ITestContext context) {
		System.out.println("---------Before Test---------");
		app = new ApplicationKeyWords();
		context.setAttribute("app", app);

	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(ITestContext context) {
		System.out.println("----- Before Method-------");
		app = (ApplicationKeyWords) context.getAttribute("app");
	}
}
