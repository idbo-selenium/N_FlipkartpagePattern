package com.Data.Revision;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_WindowBasedAlerts {

	WebDriver driver;
	@Test
	public void Handling_Alerts() throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		//enter username
		driver.findElement(By.id("Email")).sendKeys("srinivas.v145@gmail.com");
		//next button click
		driver.findElement(By.id("next")).click();
		Thread.sleep(4000);
		//enter password
		driver.findElement(By.id("Passwd")).sendKeys("krishvani");
		//signIn button click
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		//compose button click
		driver.findElement(By.xpath("//*[@id=':j2']/div/div")).click();
		Thread.sleep(3000);
		//enter to address
		driver.findElement(By.xpath("//*[@id=':oe']")).sendKeys("knskumari@gmail.com");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=':pt']")).click();
		Thread.sleep(2000);
		
		//Robot(Robot rb = new Robot();) for handling Window based Alerts(older days this robot is used) 
	}	
}