package com.wipro.Java_Selinium_01;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_Events 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver(chromeOptions);
	
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		//uppercase
		act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("vapathi@gmail.com").keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		act.moveToElement(password).click().sendKeys("vishnu@123").release().build().perform();
	
		Thread.sleep(2000);
		
		
		
	}
}
