package suitec;

import org.testng.annotations.Test;

import testbase.TestBase;

public class TestC extends TestBase {

	@Test
	public void testC() throws InterruptedException {

		log("Starting C");
		Thread.sleep(2000);
		log("Ending C");

	}

}
