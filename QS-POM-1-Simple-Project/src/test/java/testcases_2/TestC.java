package testcases_2;

import org.testng.annotations.Test;

public class TestC extends TestBase {

	@Test
	public void testC() throws InterruptedException {
		System.out.println("Start test C");
		openBrowser();
		Thread.sleep(1000);
		System.out.println("End test C");
	}
}
