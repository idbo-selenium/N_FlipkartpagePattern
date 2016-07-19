package com.Data.Revision;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploading {

	static WebDriver driver;
	String URL = "https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier";
	
	@Test
	public void testUpload() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sravan/Desktop/form.html");
		WebElement element = driver.findElement(By.name("upload"));
		element.sendKeys("C:\\Users\\sravan\\Desktop\\important\\dilip.png");
		driver.findElement(By.name("Submit")).click();
	}		
}
	/*
	static WebDriver driver;
		String URL = "application URL";
		@Test
		public void testUpload() throws InterruptedException
		{
			driver = new FirefoxDriver();
			driver.get(URL);
			WebElement element = driver.findElement(By.name("uploadsubmit"));
			element.sendKeys("D:/file.txt");
			driver.findElement(By.name("uploadSubmit"));
			String checkText = driver.findElement(By.id("message")).getText();
			Assert.assertEquals("File uploaded successfully", checkText);
		}	 
	 */