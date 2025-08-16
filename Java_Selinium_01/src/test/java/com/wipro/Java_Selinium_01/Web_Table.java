package com.wipro.Java_Selinium_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table 
{
	public static void main(String[] args) throws Exception 
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// find the rows present
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/thead/tr[1]/th"));
		int rowscount = rows.size();
		System.out.println(rowscount);
		
		// find the cols present
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/thead/tr[1]/th"));
		int colscount = cols.size();
		System.out.println(colscount);
		
		// text of a cell
		WebElement celltext = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]"));
		String actualcelltext = celltext.getText();
		String expectedcelltext = "tconway@earthlink.net";
		
		if (actualcelltext.equalsIgnoreCase(expectedcelltext))
		{
			System.out.println("The text matches");
		} else 
		{
			System.out.println("The text does not match");
		}
	}
}
