package suitea;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestAA extends TestBase {

	@Test(groups= {"sanity"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteA")
	public void testAA(String username, String password) {
		// log("Start A");
		log(username + " -- " + password);
		// log("End A");
	}
}
