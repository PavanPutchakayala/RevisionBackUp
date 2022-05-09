package testbase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class TestBase {

	ExtentReports rep;
	ExtentTest test;

	@BeforeMethod
	public void init(ITestResult result) {
		rep = ExtentManager.getReports();
		test = rep.createTest(result.getMethod().getMethodName().toUpperCase());
	}

	@AfterMethod
	public void quit() {
		rep.flush();
	}

	public void log(String msg) {
		test.log(Status.INFO, msg);
		//System.out.println(msg);
	}

}
