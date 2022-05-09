package testcases_static_demo;

import org.testng.annotations.Test;

import util.Validations;

public class TestA extends TestBase{

	@Test
	public void testA() throws InterruptedException {
		i = i+100;
		System.out.println("End test A ..." + i);
	}
}
