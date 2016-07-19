package com.Data.Revision;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Wait {

	public static WebDriver driver;
	//public static void main(String [] args){
	@Test
	public void Implicit_Wait_Handle() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("timingAlert")).click();
		System.out.println("rtfyuijkol");
		//excepted conditions wait(Title)
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleIs("TOOLSQA | Free QA Test Automation Tools Tutorial | Demo Windows for practicing Selenium Automation"));
		//wait.until(ExpectedConditions.)
		//driver.close();
		Thread.sleep(4000);
		//handling alerts using excepted conditions
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();
		//handling alerts using switchTo()
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(4000);
		driver.close();
	}	
}