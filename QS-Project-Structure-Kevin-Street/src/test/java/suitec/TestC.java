package suitec;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import testbase.TestBase;

public class TestC extends TestBase {

	@Test
	public void testC() throws InterruptedException {
		log("-- Start C --");
		Thread.sleep(1000);
		log("-- Ending C --");
	}
}
