package testcases.rediff;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import testbase.BaseTest;

public class PortfolioManagement extends BaseTest {
	
	@Test
	public void createPortfolio(ITestContext context) {
		System.out.println("..Create Portfolio...");
		app.navigate("url");
	}
	
	@Test
	public void deletePortfolio() {
		System.out.println("..Delete Portfolio...");
	}

}
