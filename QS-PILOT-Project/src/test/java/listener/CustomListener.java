package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomListener implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ ":- Test Passed");
		// System.out.println(result.getAttribute("fruit"));
		ExtentTest test = (ExtentTest) result.getAttribute("reporter");
		test.log(Status.PASS, result.getName() + ":- Test Passsed");
		System.out.println();

	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("----Test Failed--------");
		System.out.println("Failed Test Name - " + result.getName());
		System.out.println(result.getStatus());
		System.out.println(result.getThrowable().getMessage());

		ExtentTest test = (ExtentTest) result.getAttribute("reporter");
		System.out.println("Result " + result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		ExtentTest test = (ExtentTest) result.getAttribute("reporter");
		test.log(Status.SKIP, "Test Passed - " + result.getName());
	}
}
