package suitec;

import org.testng.annotations.Test;
import testbase.TestBase;


public class TestCC extends TestBase{

	@Test
	public void testCC() throws InterruptedException {

		log("Starting CC");
		Thread.sleep(2000);
		log("Ending CC");

	}

}
