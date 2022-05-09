package testbase;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeyWords;
import reports.ExtentManager;

public class BaseTest {

	public ApplicationKeyWords app;
	public ExtentTest test;
	public ExtentReports rep;

	@BeforeTest(alwaysRun = true)
	public void beforeTest(ITestContext context) {
		System.out.println("---------Before Test---------");
		app = new ApplicationKeyWords();
		context.setAttribute("app", app);

		rep = ExtentManager.getReports();
		test = rep.createTest(context.getCurrentXmlTest().getName());
		app.setReport(test);
		test.log(Status.INFO, (context.getCurrentXmlTest().getName()));
		context.setAttribute("reports", rep);
		context.setAttribute("test", test);

	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(ITestContext context) {
		System.out.println("----- Before Method-------");
		app = (ApplicationKeyWords) context.getAttribute("app");
		test = (ExtentTest) context.getAttribute("test");
		rep = (ExtentReports) context.getAttribute("reports");
	}

	@AfterTest(alwaysRun = true)
	public void quit() {
		if (rep != null)
			rep.flush();
	}
}
