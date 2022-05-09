package suitea;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testbase.TestBase;

public class TestA extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteA")
	public void testA(String userName, String passWord) throws InterruptedException {
		log("Starting A");
		log(userName +" -- "+passWord);
		//softAssert.assertEquals("Text1", "Text");
		//softAssert.assertEquals("ABC", "Text");
		Thread.sleep(2000);
		log("Ending A");

	}

}
