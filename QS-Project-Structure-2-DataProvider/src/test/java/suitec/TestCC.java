package suitec;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

import org.testng.annotations.Test;

import testbase.TestBase;

public class TestCC extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteC")
	public void testCC(String username, String password) {
		log("Start CC");
		log(username + " -- " + password);
		log("End CC");
	}
}
