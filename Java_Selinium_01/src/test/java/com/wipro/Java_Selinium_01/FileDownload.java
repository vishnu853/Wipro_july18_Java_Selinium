package com.wipro.Java_Selinium_01;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement filedownload=driver.findElement(By.xpath("//a[@href='download/test-file.txt']"));
	
		Thread.sleep(2000);
		
		filedownload.click();
		
		
		File file=new File("C:/Users/VISHNU VARDHAN/Downloads/test-file.txt");
		
		if(file.exists())
		{
			System.out.println("The file is present");
		}
		
		else
		{
			System.out.println("The file is not present");
		}
	}
}
