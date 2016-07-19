package com.Data.Revision;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	WebDriver driver;
	@Test
	public void HandlingAlerts() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Thread.sleep(2000);
		//manage booking click
		driver.findElement(By.xpath("//*[@id='mainContents']/div[3]/table/tbody/tr[1]/td[2]/a/span[1]")).click();
		
		Thread.sleep(2000);
		//getSize() web element command using dimension class
//		WebElement button = driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ButtonRetrieve"));
//		Dimension dimensions = button.getSize();
//		System.out.println("Height : "+dimensions.height+" width : "+dimensions.width);
		
		//getLoacation command using point class
//		WebElement element = driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ButtonRetrieve"));
//		Point point = element.getLocation();
//		System.out.println("X coordinate : "+point.x+"Y Cordinate : "+point.y);
		
		//getAttribute command
		WebElement element = driver.findElement(By.name("ControlGroupRetrieveBookingView$BookingRetrieveInputRetrieveBookingView$ButtonRetrieve"));
		String attribute = element.getAttribute("name");
		System.out.println("Attribute : "+attribute);
		
		driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ButtonRetrieve")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.close();
	}
}