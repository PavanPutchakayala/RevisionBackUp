package testcases_3;

import org.testng.annotations.Test;

import util.Validations;

public class TestC extends TestBase {

	@Test
	public void testC() throws InterruptedException {
		System.out.println("Start test C");
		openBrowser();
		Validations v = new Validations();
		v.validateTitle("xxxx", driver);
		Thread.sleep(1000);
		System.out.println("End test C");
	}
}
