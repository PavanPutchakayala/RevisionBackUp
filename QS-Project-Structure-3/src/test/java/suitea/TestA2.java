package suitea;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testbase.TestBase;

public class TestA2 extends TestBase {

	@Parameters("browser")
	@Test(groups= {"smoke"})
	public void testA(String para) {
		log("Starting testA -- " + para);
	}
}
