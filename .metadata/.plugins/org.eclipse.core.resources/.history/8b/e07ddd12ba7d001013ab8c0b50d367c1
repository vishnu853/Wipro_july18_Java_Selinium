package com.wipro.Java_Selinium_01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		WebElement radiobox=driver.findElement(By.xpath("//input[@value = 'radio3']"));
		radiobox.click();
		
		Thread.sleep(2000);
	}
}
