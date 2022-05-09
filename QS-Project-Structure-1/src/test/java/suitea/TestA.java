package suitea;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

import org.testng.annotations.Test;

import testbase.TestBase;

public class TestA extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider="dataSuiteA")
	public void testA() {
		log("Start A --");
		log("End A --");
	}

}
