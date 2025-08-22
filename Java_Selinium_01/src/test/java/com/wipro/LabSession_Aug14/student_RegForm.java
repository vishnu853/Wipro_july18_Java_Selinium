package com.wipro.LabSession_Aug14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class student_RegForm {
	public static void main(String[] args) throws Exception {
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// User-Name
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Apathi Vishnu Vardhan");

		Thread.sleep(2000);

		// User-Email_Id
		WebElement emailid = driver.findElement(By.xpath("//input[@name='email']"));
		emailid.sendKeys("vapathi@gitam.in");

		Thread.sleep(1000);

		// Gender
		WebElement gender= driver.findElement(By.xpath("//input[@id='gender']"));
		gender.click();

		Thread.sleep(1000);

		// Mobile_Number

		WebElement mobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		mobile.sendKeys("9652211550");

		Thread.sleep(1000);

		// Date of birth

		WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
		dob.sendKeys("09-09-2002");

		Thread.sleep(1000);

		// Subjects
		WebElement subject = driver.findElement(By.xpath("//input[@id='subjects']"));
		subject.sendKeys("Java Selinium");

		Thread.sleep(1000);

		// Hobbies
		List<WebElement> hobbies = driver.findElements(By.xpath("//label[@for='hobbies']"));

		int size = hobbies.size();

		System.out.println(size);

		// for loop to iterate the in the list of checkboxes

		for (int i = 0; i < size; i++) 
		{
			Thread.sleep(1000);

			hobbies.get(i).click();

			Thread.sleep(1000);
		}
		
		
		// File_Choose
		WebElement fileupload=driver.findElement(By.xpath("//input[@id='picture']"));
		fileupload.sendKeys("D:/abc1.txt");
		
		Thread.sleep(1000);
		
		//Current Address
		WebElement address=driver.findElement(By.xpath("//textarea[@id='picture']"));
		address.sendKeys("Kurnool, Andhra Pradesh");
		
		//State
		
		WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
		Select se1= new Select(state);
		se1.selectByIndex(1);
		
		//city
		
		WebElement city=driver.findElement(By.xpath("//label[@id='city-error']"));
		Select se2= new Select(city);
		se1.selectByIndex(1);
		
		// login
		
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
	}
}
