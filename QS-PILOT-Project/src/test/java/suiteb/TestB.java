package suiteb;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestB extends TestBase{

	@Test(dataProviderClass=TestDataProvider.class, dataProvider="dataSuiteB")
	public void testB(String b1, String b2, String b3) throws InterruptedException {
		
		log("Started C");
		log(b1+ " "+b2+ " " +b3);
		
		Thread.sleep(2000);
		log("Ended C");
		System.out.println();
	}
}
