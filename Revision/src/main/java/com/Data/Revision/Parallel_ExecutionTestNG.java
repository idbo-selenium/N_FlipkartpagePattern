package com.Data.Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Parallel_ExecutionTestNG {

	WebDriver driver;
	
	@AfterClass
	public void AfterClass(){
		driver.close();
	}
	
	@BeforeClass
	public void BeforeClass(){
		driver = new FirefoxDriver();
	}
	
	@Test(priority=2)
	public void Test2() throws InterruptedException{
		System.out.println("Test2 method");
		driver.navigate().to("http://docs.seleniumhq.org/");
		Thread.sleep(4000);
	}	
	
	@Test(priority=1)
	public void Test1() throws InterruptedException{
		System.out.println("Test1 method");
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(4000);
	}	
}