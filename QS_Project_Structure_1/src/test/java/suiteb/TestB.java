package suiteb;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;


public class TestB extends TestBase{

	@Test//(dataProviderClass = TestDataProvider.class, dataProvider="dataSuiteB")
	public void testB() throws InterruptedException {

		log("Starting B");
		Thread.sleep(2000);
		log("Ending B");

	}

}
