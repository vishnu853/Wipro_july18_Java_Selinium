package com.wipro.LabSession_Aug13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucelabs 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name = 'user-name']"));
		username.sendKeys("standard_user");
		
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id= 'password']"));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//input[@id= 'login-button']"));
		login.click();
		
	}
}
