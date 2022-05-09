package suitec;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestC extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteC")
	public void testC(String un) throws InterruptedException {

		log(un);
		log("Starting C");
		Thread.sleep(2000);
		log("Ending C");
	}

}
