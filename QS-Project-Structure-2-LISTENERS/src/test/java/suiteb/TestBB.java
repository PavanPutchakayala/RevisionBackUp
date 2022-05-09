package suiteb;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestBB extends TestBase {

	@Test(groups = { "smoke" }, dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteB")
	public void testBB(String username, String password) {
		log("Start BB");
		log(username + " -- " + password);
		log("End BB");
	}
}
