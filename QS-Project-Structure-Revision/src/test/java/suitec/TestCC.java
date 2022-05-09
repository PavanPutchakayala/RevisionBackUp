package suitec;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestCC extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteC")
	public void testCC(String un, String pwd) throws InterruptedException {

		log("Starting CC");
		log(un + " - " + pwd);
		Thread.sleep(2000);
		log("Ending CC");
		System.out.println();
	}

}
