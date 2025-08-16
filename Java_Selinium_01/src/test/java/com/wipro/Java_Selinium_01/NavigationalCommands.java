package com.wipro.Java_Selinium_01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
	}
}	
