package com.wipro.Java_Selinium_01;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implict_Time
{

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		//Action class is used to simulate the mouse related activities
		Actions act = new Actions(driver);
		
		WebElement from= driver.findElement(By.id("column-a"));
		WebElement to= driver.findElement(By.id("column-b"));
		
		act.dragAndDrop(from,to).perform();
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		
		
	
		
		

	}

}
