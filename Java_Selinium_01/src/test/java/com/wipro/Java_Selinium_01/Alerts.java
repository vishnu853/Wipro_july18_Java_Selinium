package com.wipro.Java_Selinium_01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// Simple Alert
		
		WebElement simplealert=driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		
		simplealert.click();
		
		Thread.sleep(2000);
		
		Alert alt01=driver.switchTo().alert();
		
		//cliok on accept button
		alt01.accept();
		
		Thread.sleep(2000);
		
		
		
		//Click on confirm alert
		
		WebElement confirmalert=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		
		confirmalert.click();
		
		Thread.sleep(2000);
		
		Alert alt02=driver.switchTo().alert();
		
		//click on cancel button
		alt02.dismiss();
		
		Thread.sleep(2000);
		
		
		// Prompt alert
		
		
		WebElement promptalert=driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		
		promptalert.click();
		
		Thread.sleep(2000);
		
		Alert alt03=driver.switchTo().alert();
		
		String alerttext=alt03.getText();
		System.out.println(alerttext);
		
		alt03.sendKeys("Vishnu");
		
		//click on ok button
		alt03.accept();
		
		Thread.sleep(2000);
		
	}
}
