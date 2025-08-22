package com.wipro.LabSession_Aug19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_lab4 
{
	@Test(priority = 1, groups = {"Smoke"})
	
	public void addcart() throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String actualtitle = driver.getTitle();

		System.out.println(actualtitle);

		String expectedtitle = "STORE123";

		// hard assertion  - the validation fails if the assertion is failing 
		//Assert.assertEquals(actualtitle,expectedtitle);
		
		// Soft assert
		SoftAssert soft = new SoftAssert();

		soft.assertEquals(actualtitle, expectedtitle);
		
		
		
		
		
		WebElement categories=driver.findElement(By.xpath("//a[3]"));
		categories.click();
		
		Thread.sleep(2000);
		
		WebElement laptop=driver.findElement(By.xpath("//h4[@class='card-title']"));
		laptop.click();
		
		Thread.sleep(2000);
		
		WebElement addcart=driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
		addcart.click();
		
		Thread.sleep(2000);
		
		Alert alt01=driver.switchTo().alert();
		alt01.accept();
		
		Thread.sleep(2000);
		
		WebElement cart=driver.findElement(By.xpath("//a[@id='cartur']"));
		cart.click();
		
		Thread.sleep(2000);
		
		WebElement placeorder=driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
		placeorder.click();
		
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Vishnu Vardhan");
		
		Thread.sleep(2000);
		
		WebElement country=driver.findElement(By.xpath("//input[@id='country']"));
		country.sendKeys("India");
		
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Kurnool");
		
		Thread.sleep(2000);
		
		WebElement creditcard=driver.findElement(By.xpath("//input[@id='card']"));
		creditcard.sendKeys("94637449278");
		
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//input[@id='month']"));
		month.sendKeys("September");
		
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//input[@id='year']"));
		year.sendKeys("2025");
		
		Thread.sleep(2000);
		
		WebElement purchase=driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']"));
		purchase.click();
		Thread.sleep(2000);
		
		
		WebElement successful=driver.findElement(By.xpath("//button[@tabindex='1']"));
		successful.click();
		Thread.sleep(2000);
		
		soft.assertAll();
		
	}
}
