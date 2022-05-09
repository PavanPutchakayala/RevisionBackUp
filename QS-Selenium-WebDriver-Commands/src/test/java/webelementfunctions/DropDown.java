package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestBase;

public class DropDown extends TestBase {
	
	String browser = "Chrome";
	String url = "https://www.qtpselenium.com/contact-us";
	
	//Select 
	//Read Selected
	//Total Number of Elements - Size
	//Print all options
	@Test
	public void appTest() {
		WebDriver driver = launchBrowser("Chrome");
		driver.get(url);
		
		WebElement dropList = driver.findElement(By.name("country_id"));
		Select s = new Select(dropList);
		//s.selectByIndex(5);
		//s.selectByValue("India");
		s.selectByVisibleText("India");
		
		WebElement selectOption = s.getFirstSelectedOption();
		System.out.println(selectOption.getText());
		
	}
	 

	
	
	

	
	

}
