package com.wipro.Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeliniumGridTestCase extends Helperclass
{
	@Test
	public void login() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		
		WebElement Username = getDriver().findElement(By.xpath("//input[@placeholder='Username']"));
		Username.sendKeys("Admin");

		Thread.sleep(1000);

		// name locator 

		WebElement Password  = getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("admin123");

		Thread.sleep(1000);

		WebElement LoginButton = getDriver().findElement(By.tagName("button"));

		LoginButton.click();

		Thread.sleep(2000);

	}
}
