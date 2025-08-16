package com.wipro.Java_Selinium_01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']"));
		
		Select se1= new Select(dropdown);
		
		se1.selectByVisibleText("Option1");
		
		Thread.sleep(2000);
		
		se1.selectByValue("option2");
		
		Thread.sleep(2000);
		
		se1.selectByIndex(3);
		
		
	}
}
