package util;

import testcases.TestBase;

public class Validations {
	
	
	public void validateTitle(String expectedTitle) {
		TestBase.driver.getTitle();
	}
	
	
	/*
	public void validateTitle(String expectedTitle, WebDriver driver) {
		driver.getTitle();
	}
	
	public void validateText(String expectedText, WebDriver driver) {
		System.out.println("Print Text");
	}
	
	public void validatePageLoad(String expectedLoadtime, WebDriver driver) {
		System.out.println("Print Load Time");
	}
	
	// Multiple Validations will be there

	*/
	
	
}
