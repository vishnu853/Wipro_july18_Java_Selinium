package com.wipro.LabSession_Aug18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Travels_Booking 
{
	@Test
	public void flights() throws Exception
	{
		ChromeOptions chromeOptions=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://phptravels.net/flights/hyd/bom/oneway/economy/21-08-2025/1/0/0");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//one way
//		WebElement oneway=driver.findElement(By.xpath("//option[@value='oneway']"));
//		oneway.click();
//		
//		//bussiness class
//		WebElement ticket=driver.findElement(By.xpath("//option[@value='business']"));
//		ticket.click();
//		
//		//from 
//		WebElement from=driver.findElement(By.xpath("//input[@name='from']"));
//		from.sendKeys("HYD");
//		
//		//to
//		WebElement to=driver.findElement(By.xpath("//input[@name='to']"));
//		to.sendKeys("BOM");
//		
//		//calender
//  	WebElement depart=driver.findElement(By.xpath("//input[@id='departure']"));
//		depart.sendKeys("25-08-2025");	
//
//		
//		WebElement passengers=driver.findElement(By.xpath("//div[@class='col-lg-2']//a[@role='button']"));
//		Select se1= new Select(passengers);
//		se1.selectByIndex(0);
//		
//		WebElement search=driver.findElement(By.xpath("//button[@id='flights-search']"));
//		search.click();
		
		WebElement stops=driver.findElement(By.xpath("//input[@id='oneway_flights_0']"));
		stops.click();
		
		WebElement selectflight=driver.findElement(By.xpath("//button[@id='flights-search']"));
		selectflight.click();
		

	}
}
