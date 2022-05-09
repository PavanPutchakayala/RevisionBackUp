package suitea;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestAA extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteA")
	public void testAA(String userName, String passWord) throws InterruptedException {
		log("Starting AA");
		log(userName +" -- "+passWord);
		Thread.sleep(2000);
		log("Ending AA");

	}

}
