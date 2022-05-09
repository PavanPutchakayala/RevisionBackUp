package suiteb;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

import org.testng.annotations.Test;

import testbase.TestBase;

public class TestB extends TestBase {

	@Test(groups= {"sanity"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteB")
	public void testB(String username, String password) {
		log("Start B");
		log(username + " -- " + password);
		log("End B");
	}
}
