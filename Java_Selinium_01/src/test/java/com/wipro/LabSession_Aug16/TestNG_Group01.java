package com.wipro.LabSession_Aug16;

import org.testng.annotations.Test;

public class TestNG_Group01 
{
	@Test (groups = {"Smoke"})
	public void loginTest() {
		System.out.println("Testcase1 is executed");
		
	}
	@Test (groups = {"Regression"})
    public void paymentTest() 
	{
		System.out.println("Testcase2 is executed");
		
	}
	@Test (groups = {"Smoke","Regression"})
    public void payoutTest() {
		System.out.println("Testcase3 is executed");
	
   }
}
