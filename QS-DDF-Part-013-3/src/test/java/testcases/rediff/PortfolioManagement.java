package testcases.rediff;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import testbase.BaseTest_My;

public class PortfolioManagement extends BaseTest_My {
	@Test
	public void createPortfolio(ITestContext context) {
		String portfolioName= "Portfolio 19762059";		
		app.log("Creating Profolio");
		app.click("createPortfolio_id");
		app.clear("porfolioname_id");
		app.type("porfolioname_id", portfolioName);
		app.click("createPortfolioButton_css");
		app.waitForPageToLoad();
		app.validateSelectedValueInDropDown("portfolioid_dropdown_id",portfolioName);
	}
	
	
	@Test
	public void deletePortfolio(ITestContext context) {
		String portfolioName="Portfolio 19762058";		
		app.log("Deleting Profolio");
        app.selectByVisibleText("portfolioid_dropdown_id", portfolioName);
        app.waitForPageToLoad();
        app.click("deletePortfolio_id");
        app.acceptAlert();
        app.validateSelectedValueNotInDropDown("portfolioid_dropdown_id",portfolioName);
	}
	
	@Test
	public void selectPortFolio(ITestContext context) {
		
		String portfolioName="Portfolio 19762024";		
		app.log("Selecting Profolio");
		app.selectByVisibleText("portfolioid_dropdown_id", portfolioName);
        app.waitForPageToLoad();
	}
	

	
}