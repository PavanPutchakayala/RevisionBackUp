package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class RegTest {

	ExtentTest test;
	ExtentReports reports;

	@BeforeMethod
	public void init() {
		reports = ExtentManager.getReports();

		test = reports.createTest("RegisterTest");
	}

	@AfterMethod
	public void quit() {
		reports.flush();
	}

	@Test
	public void doRegister() {
		test.log(Status.INFO, "RegisterTest started");
		test.log(Status.PASS, "RegisterTest ended");
	}
}

