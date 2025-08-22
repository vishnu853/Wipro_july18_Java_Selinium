package com.wipro.LabSession_Aug18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_FormFilling 
{
	@Test
	public  void formfilling() throws InterruptedException
	{
		ChromeOptions chromeOptions=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Vishnu Vardhan");
		
		Thread.sleep(1000);
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Apathi");
		
		Thread.sleep(1000);
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='Male']"));
		radio.click();
		
		Thread.sleep(1000);
		
		WebElement experience=driver.findElement(By.xpath("//input[@id='exp-0']"));
		experience.click();
		
		Thread.sleep(1000);
		
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("01-08-2024");
		
		WebElement profession=driver.findElement(By.xpath("//input[@id='profession-1']"));
		profession.click();
		
		WebElement tools=driver.findElement(By.xpath("//input[@id='tool-2']"));
		tools.click();
		
		WebElement uploadimage=driver.findElement(By.xpath("//input[@id='photo']"));
		uploadimage.sendKeys("C:/Users/VISHNU VARDHAN/OneDrive/Pictures/Screenshots/change branch01.png");
		
		WebElement button=driver.findElement(By.xpath("//button[@id='submit']"));
		button.click();
		
		driver.close();
	}
}
