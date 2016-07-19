package com.Data.Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop_Actions {

	WebDriver driver;
	@Test
	public void DraggableTest() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		Thread.sleep(4000);
		WebElement ad = driver.findElement(By.id("draggable"));		
		Actions action = new Actions(driver);		
		action.dragAndDropBy(ad, 30, 50).perform();
	}
	
	@Test
	public void DropableTest() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe")));
		Thread.sleep(4000);
		WebElement drop = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(drop, 30, 50).perform();
	}
}