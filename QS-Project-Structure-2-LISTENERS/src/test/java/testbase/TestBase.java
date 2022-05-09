package testbase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class TestBase {

	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert softAssert;

	@BeforeMethod(alwaysRun = true)
	public void init(ITestResult result) {
		rep = ExtentManager.getReports();
		test = rep.createTest(result.getMethod().getMethodName().toUpperCase());
		result.setAttribute("reporter", test);
		softAssert = new SoftAssert();
	}

	@AfterMethod(alwaysRun = true)
	public void quit() {
		rep.flush();
	}

	public void log(String msg) {
		test.log(Status.INFO, msg);
		// System.out.println(msg);
	}

	public void logFailure(String msg) {
		test.log(Status.FAIL, msg);
		// System.out.println(msg);
	}

	public void failAndStop(String msg) {
		logFailure(msg); // extent Reports
		softAssert.fail(msg); // testNG
		softAssert.assertAll();
	}

	public void softAssert(String msg) {
		logFailure(msg); // extent Reports
		softAssert.fail(msg); // testNG
	}

}
