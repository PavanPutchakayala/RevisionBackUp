package testcases;

import org.testng.annotations.Test;

import util.Validations;

import org.testng.annotations.Test;

public class TestB extends TestBase {

	@Test
	public void testB() throws InterruptedException {
		System.out.println("Start test B");
		openBrowser();
		Validations v = new Validations();
		v.validateTitle("xxxx");
		Thread.sleep(1000);
		System.out.println("End test B");
	}
}
