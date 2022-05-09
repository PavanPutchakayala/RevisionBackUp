package suiteb;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestBB extends TestBase {

	@Test//(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteB")
	public void testBB() throws InterruptedException {

		log("Starting BB");
		Thread.sleep(2000);
		log("Ending BB");

	}

}
