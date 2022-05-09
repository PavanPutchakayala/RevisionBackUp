package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class Zoho extends TestBase {

	String browser = "Chrome";
	String url = "https://www.zoho.com/signup.html";
	
	
	//@Test
	public void getAttributeTest() throws InterruptedException {

		WebDriver driver = launchBrowser(browser);
		getUrl(url);
		driver.findElement(By.xpath("//input[@id='emailfield']")).sendKeys("Hello");

		String value = driver.findElement(By.xpath("//input[@id='emailfield']")).getAttribute("value");
		System.out.println(value);

		String id = driver.findElement(By.xpath("//input[@id='emailfield']")).getAttribute("id");
		System.out.println(id);

		String name = driver.findElement(By.xpath("//input[@id='emailfield']")).getAttribute("name");
		System.out.println(name);

		String clas = driver.findElement(By.xpath("//input[@id='emailfield']")).getAttribute("class");
		System.out.println(clas);

		String tabIndex = driver.findElement(By.xpath("//input[@id='emailfield']")).getAttribute("tabindex");
		System.out.println(tabIndex);

	}

	@Test
	public void isEnabledCheckBox() throws InterruptedException {
		
		WebDriver driver = launchBrowser(browser);
		getUrl(url);
		boolean b = driver.findElement(By.xpath("//input[@id='tos']")).isEnabled();
		System.out.println(b);

		int i = 1;
		while (i <= 10) {
			if (driver.findElement(By.xpath("//input[@id='tos']")).isEnabled()) {
				break;
			} else {
				Thread.sleep(1000);
				i++;
			}
		}

		driver.findElement(By.xpath("//input[@id='tos']")).click();

		b = driver.findElement(By.xpath("//input[@id='tos']")).isEnabled();
		System.out.println("Enabled: "+ b);
		
		String text = driver.findElement(By.xpath("//input[@id='tos']")).getAttribute("checked");
		System.out.println("Checked: "+ text);

	}

	
	
}
