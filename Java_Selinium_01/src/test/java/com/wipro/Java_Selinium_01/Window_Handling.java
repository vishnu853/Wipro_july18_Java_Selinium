package com.wipro.Java_Selinium_01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handling 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement clickhere=driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		clickhere.click();
		
		Thread.sleep(2000);
		
		Object[] windowhandles=driver.getWindowHandles().toArray();
		System.out.println(windowhandles);
		
		driver.switchTo().window((String) windowhandles[1]);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window((String) windowhandles[0]);
		
	}
}
