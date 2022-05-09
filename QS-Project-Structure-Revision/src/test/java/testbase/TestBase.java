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

	public ExtentReports reports;
	public ExtentTest test;
	public SoftAssert softAssert;	
	
	@BeforeMethod
	public void init(ITestResult result) {
		reports = ExtentManager.getReports();
		test = reports.createTest(result.getMethod().getMethodName());
		//result.setAttribute("fruit", "mango");
		result.setAttribute("reporter", test);
	}

	@AfterMethod
	public void quit() {
		reports.flush();
	}

	public void log(String msg) {
		test.log(Status.INFO, msg);
		System.out.println(msg);
	}

}
