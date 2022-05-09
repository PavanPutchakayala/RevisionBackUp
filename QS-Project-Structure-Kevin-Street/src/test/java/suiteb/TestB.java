package suiteb;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import testbase.TestBase;

public class TestB extends TestBase {

	@Test
	public void testB() throws InterruptedException {
		log("-- Start B --");
		Thread.sleep(1000);
		log("-- Ending B --");
	}
}
