package testcases;

import org.testng.annotations.Test;

import util.Validations;

public class TestA extends TestBase{

	@Test
	public void testA() throws InterruptedException {
		System.out.println("Start test A");
		openBrowser();
		Validations v = new Validations();
		v.validateTitle("xxxx");
		driver.quit();
		Thread.sleep(5000);
		System.out.println("End test A");
	}
}
