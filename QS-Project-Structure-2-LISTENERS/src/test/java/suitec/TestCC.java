package suitec;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

import org.testng.annotations.Test;

import testbase.TestBase;

public class TestCC extends TestBase {

	@Test(groups= {"smoke", "sanity"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteC")
	public void testCC(String username, String password) {
		log("Start CC");
		log(username + " -- " + password);
		Assert.fail(" I am @testCC");
		log("End CC");
	}
}
