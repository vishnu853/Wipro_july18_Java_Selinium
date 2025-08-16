package com.wipro.Java_Selinium_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//close the current window
		
		driver.close();
		
		//close all the windows
		
		driver.quit();
	}
}
