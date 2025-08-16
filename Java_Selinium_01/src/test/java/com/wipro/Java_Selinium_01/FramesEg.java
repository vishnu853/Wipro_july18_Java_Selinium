package com.wipro.Java_Selinium_01;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEg 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver(chromeOptions);
	
		driver.get("https://jqueryui.com/droppable/");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		//frame with index value
		//driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
	}
}
