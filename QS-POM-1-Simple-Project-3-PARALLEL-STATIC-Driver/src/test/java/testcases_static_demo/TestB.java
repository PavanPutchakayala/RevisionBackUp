package testcases_static_demo;

import org.testng.annotations.Test;

import util.Validations;

import org.testng.annotations.Test;

public class TestB extends TestBase {

	@Test
	public void testB() throws InterruptedException {
		i = i+100;
		System.out.println("End test B ..." + i);
	}
}
