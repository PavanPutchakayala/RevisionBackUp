package suitea;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestAA extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteA")
	public void testAA(String username, String password) throws InterruptedException {

		log(username + " - - "+ password);
		Thread.sleep(2000);
		log("Ending AA");

	}

}
