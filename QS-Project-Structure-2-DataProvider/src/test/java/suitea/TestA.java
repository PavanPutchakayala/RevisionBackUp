package suitea;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

import org.testng.annotations.Test;

import testbase.TestBase;

public class TestA extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteA")
	public void testA(String username, String password) {
		log("Start A");
		log(username + " -- " + password);
		log("End A");
	}
}
