package testcases.rediff;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testbase.BaseTest;

public class PortfolioManagement extends BaseTest {

	@Test
	public void createPortfolio(ITestContext context) {
		app.log("..Create Portfolio...");
		app.reportFailure("some non critical failure", false);
		app.assertAll();
	}

	@Test
	public void deletePortfolio() {
		app.log("..Delete Portfolio..");
	}

}
