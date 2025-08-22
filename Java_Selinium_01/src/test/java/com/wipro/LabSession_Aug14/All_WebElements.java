package com.wipro.LabSession_Aug14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_WebElements 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		//Radio_Boxes
		List<WebElement> radioboxes=driver.findElements(By.xpath("//input[@type='radio']"));
		
		int size01=radioboxes.size();
		System.out.println(size01);
		
		for(int i=0;i<size01;i++)
		{
			Thread.sleep(1000);
			
			radioboxes.get(i).click();
			
			Thread.sleep(1000);
		}
		
		//Suggestion class Example
		WebElement countries=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		countries.sendKeys("India");
		
		Thread.sleep(2000);
		
		// Drop_Down_list
		WebElement dropdown=driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']"));
		
		Select se1= new Select(dropdown);
		
		se1.selectByVisibleText("Option1");
		
		Thread.sleep(2000);
		
		//CheckBoxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int size02=checkboxes.size();
		
		System.out.println(size02);
		
		// for loop to iterate the in the list of checkboxes
		for(int i=0; i<size02;i++)
		{
			Thread.sleep(1000);
			
			checkboxes.get(i).click();
			
			Thread.sleep(1000);
		}
		
		//Switch Window Example
		
		WebElement window=driver.findElement(By.xpath("//button[@id='openwindow']"));
		window.click();
		
		Thread.sleep(2000);
		
		WebElement tab=driver.findElement(By.xpath("//a[@id='opentab']"));
		tab.click();
		
		
				
		
	}
}
