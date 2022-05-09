package suitea;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

import org.testng.annotations.Test;

import testbase.TestBase;

public class TestA extends TestBase {

	@Parameters("browser")
	// @Test(groups= {"smoke"},dataProviderClass = TestDataProvider.class,
	// dataProvider = "datasuiteA")
	@Test(groups = { "smoke" })
	public void testA(String para) {
		log("Start A ---- " + para);

		if (!"ABC".equals("abc")) {
			softAssert("Titles - NOT Matching");
		}
		log("Browser Launched Successfully");
		log("Navigated to url");
		log("Application Launched");

		if (!"Text1".equals("TexT1")) {
			softAssert("TEXT - NOT Matching");
		}

		if (!"a".equals("b"))
			failAndStop("NOT Valid - Show Stopper");

		softAssert.assertEquals("assddd", "text");
		// log(username + " -- " + password);
		log("End A");
		softAssert.assertAll();
	}
}
