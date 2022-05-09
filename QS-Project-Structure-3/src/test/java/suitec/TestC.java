package suitec;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestC extends TestBase {

	@Test(groups= {"smoke"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteC")
	public void testC(String username, String password) {
		log("Start C");
		log(username + " -- " + password);
		log("End C");
	}
}
