package com.wipro.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations 
{
	@BeforeTest

	public void beforetest() {

		System.out.println("Before Test");

	}

 
	@AfterTest

	public void aftertest() {

		System.out.println("After Test");

	}

	@BeforeClass

	public void beforeclass() {

		System.out.println("Before Class");

	}

 
	@AfterClass

	public void afterclass() {

		System.out.println("After Class");

	}

	@BeforeSuite

	public void beforesuite() {

		System.out.println("Before Suite");

	}

 
	@AfterSuite

	public void aftersuite() {

		System.out.println("After Suite");

	}

	@BeforeMethod

	public void beforemethod() {

		System.out.println("Before Method");

	}

 
	@AfterMethod

	public void aftemethod() {

		System.out.println("After Method");

	}

	@Test

	public void testcase1() {
 
		System.out.println("Testcase1 is executed");

	}
 
	@Test

	public void testcase2() {
 
		System.out.println("Testcase2 is executed");
 
	}
 
	@Test

	public void testcase3() {
 
		System.out.println("Testcase3 is executed");
 
	}	
 
}
