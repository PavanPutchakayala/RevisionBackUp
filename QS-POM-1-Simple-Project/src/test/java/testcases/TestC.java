package testcases;

import org.testng.annotations.Test;

public class TestC {

	@Test
	public void testC() throws InterruptedException {
		System.out.println("Start test C");
		Thread.sleep(2000);
		System.out.println("End test C");
	}
}
