package com.wipro.LabSession_Aug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Move_To_Page
{
	public static void main(String[] args)throws Exception
	{

		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		
		WebElement mouseover=driver.findElement(By.id("mousehover"));
		act.moveToElement(mouseover).perform();
		
		Thread.sleep(2000);
		
		WebElement top=driver.findElement(By.xpath("//a[@href= '#top']"));
		act.click(top).perform();
		
		Thread.sleep(2000);
	}
}
