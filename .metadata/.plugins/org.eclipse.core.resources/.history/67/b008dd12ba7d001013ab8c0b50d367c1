package com.wipro.Java_Selinium_01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement fileupload=driver.findElement(By.xpath("//input[@id='file-upload']"));
		fileupload.sendKeys("C:/Users/VISHNU VARDHAN/OneDrive/Pictures/Screenshots/change branch01.png");
		
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.xpath("//input[@id='file-submit']"));
		submit.click();
		
		Thread.sleep(2000);
		
		WebElement validationmsg=driver.findElement(By.xpath("//div[@id='flash-messages']"));
		
		if(validationmsg.isDisplayed())
		{
			System.out.println("The message is displayed properly");
		}
		
		else 
		{
			System.out.println("The message is not displayed");
		}
	}
}
