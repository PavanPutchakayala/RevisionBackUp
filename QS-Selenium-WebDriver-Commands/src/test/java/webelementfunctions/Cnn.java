package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.testng.annotations.Test;

import base.TestBase;

public class Cnn extends TestBase{

	
	@Test
	public void appTest() {
		WebDriver driver = launchBrowser("chrome");
		driver.get("https://edition.cnn.com/"); // Wait till the page loads 100%
		boolean result = driver.findElement(By.xpath("//header[@id='header-nav-container']//div[@class='Box-sc-1fet97o-0 jSTOdN']/nav/ul[@type='expanded']/li[3]/ul//a[@name='markets']")).isDisplayed();
		System.out.println(result);
		
		//driver.findElement(By.xpath("//*[@id='header-nav-container']")).click();
		driver.findElement(By.xpath("//*[@id='header-nav-container']/div/div[1]/div/button/svg")).click();
		
		result = driver.findElement(By.xpath("//header[@id='header-nav-container']//div[@class='Box-sc-1fet97o-0 jSTOdN']/nav/ul[@type='expanded']/li[3]/ul//a[@name='markets']")).isDisplayed();
		System.out.println(result);
	
	}
}
