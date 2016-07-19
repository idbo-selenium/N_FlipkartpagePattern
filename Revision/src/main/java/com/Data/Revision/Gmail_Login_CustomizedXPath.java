package com.Data.Revision;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_CustomizedXPath {

	WebDriver driver = null;
	@Before
	public void Init(){
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
	}
	
	@After
	public void Cleanup(){
		driver.close();
	}
	
	@Test
	public void Customized_Xpath() throws InterruptedException{
		driver.navigate().to("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");		
		driver.findElement(By.xpath("//*[@id='identifier-shown']/div/input[1]")).sendKeys("srinivas.v145@gmail.com");
		driver.findElement(By.xpath("//*[@class='slide-out ']/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password-shown']/div/input[2]")).sendKeys("krishvani");
		driver.findElement(By.xpath("//*[@class='slide-in']/input[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='gb_oc gb_bb gb_hf gb_R']/a/span")).click();
		driver.findElement(By.xpath("//*[@class='gb_rb']/div[2]/a")).click();
	}	
}