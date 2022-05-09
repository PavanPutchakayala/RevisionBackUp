package testcases_2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestB extends TestBase {

	@Test
	public void testB() throws InterruptedException {
		System.out.println("Start test B");
		openBrowser();
		Thread.sleep(1000);
		System.out.println("End test B");
	}
}
