package testcases_static_demo;

import org.testng.annotations.Test;

import util.Validations;

public class TestC extends TestBase {

	@Test
	public void testC() throws InterruptedException {
		i = i+100;
		System.out.println("End test C ..." + i);
	}
}
