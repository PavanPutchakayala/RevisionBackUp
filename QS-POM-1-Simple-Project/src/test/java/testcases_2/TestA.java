package testcases_2;

import org.testng.annotations.Test;

public class TestA extends TestBase{

	@Test
	public void testA() throws InterruptedException {
		System.out.println("Start test A");
		openBrowser();
		Thread.sleep(1000);
		System.out.println("End test A");
	}
}
