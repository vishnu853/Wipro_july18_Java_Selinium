package com.wipro.Java_Selinium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://ui.shadcn.com/docs/components/date-picker");
		
		Thread.sleep(2000);
		
		WebElement datepicker= driver.findElement(By.xpath("//body/div[@class='bg-background relative z-10 flex min-h-svh flex-col']/main[@class='flex flex-1 flex-col']/div[@class='container-wrapper flex flex-1 flex-col px-2']/div[1]"));
		datepicker.click();
		
		Thread.sleep(2000);
		
		WebElement datepicker01= driver.findElement(By.xpath("//button[@aria-label='Go to the Previous Month']"));
		datepicker01.click();
		
		Thread.sleep(2000);
		
		WebElement datepicker02= driver.findElement(By.xpath("//button[@data-day = '8/20/2025']"));
		datepicker02.click();
		
	}
}
