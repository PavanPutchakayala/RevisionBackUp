package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import reports.ExtentManager;

public class LoginTest {
	ExtentTest test;
	ExtentReports reports;

	@BeforeMethod
	public void init() {
		reports = ExtentManager.getReports();
		test = reports.createTest("LoginTest");
	}

	@AfterMethod
	public void quit() {
		reports.flush();
	}

	@Test
	public void login() throws IOException {
		System.out.println(System.getProperty("user.dir"));

		test.log(Status.INFO, "Starting test case Login");
		test.log(Status.FAIL, "404 error");
		Assert.fail("404 error");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Logging In");
		test.log(Status.PASS, "Test Passed");

	}

}
