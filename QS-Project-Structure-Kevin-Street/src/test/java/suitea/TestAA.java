package suitea;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import testbase.TestBase;

public class TestAA extends TestBase {

	@Test
	public void testAA() throws InterruptedException {
		log("-- Start AA --");
		Thread.sleep(1000);
		log("-- Ending AA --");
	}
}
