package com.wipro.Java_Selinium_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_ToElement 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement about_amz=driver.findElement(By.xpath("//a[normalize-space()='About Amazon']"));
		
		Actions actions=new Actions(driver);
		
		Thread.sleep(2000);
		actions.scrollToElement(about_amz).perform();
		
		about_amz.click();
	}
	
	
}
