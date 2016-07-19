package com.Data.Revision;

import java.util.List;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Confirmation_Popup_Handlings {

	@Test
	//handling confirmation alert(popup)
//	public void Confirmation_Popup() throws InterruptedException{
//		WebDriver driver = new FirefoxDriver();
//		driver.navigate().to("file:///C:/Users/sravan/Desktop/form.html");
//		driver.findElement(By.xpath("/html/body/fieldset/button")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());		
//		alert.dismiss();
//		Thread.sleep(2000);
//		driver.close();
//	}
	
	//handling Prompt alert(popup)
//	public void Prompt_Popup() throws InterruptedException{
//		WebDriver driver = new FirefoxDriver();
//		driver.navigate().to("file:///C:/Users/sravan/Desktop/form.html");
//		driver.findElement(By.xpath("/html/body/fieldset/button")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		driver.switchTo().alert().sendKeys("Nirmala");
//		alert.accept();
//		Thread.sleep(2000);
//		driver.close();
//	}
	
	//Select method to work with Dropdowns
	public void Handle_DropDowns() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/sravan/Desktop/form.html");
		Thread.sleep(2000);
		driver.navigate().refresh();
		WebElement selectButton = driver.findElement(By.name("Mobiles"));
		Select se = new Select(selectButton);
		se.selectByIndex(1);
		Thread.sleep(2000);
		se.selectByValue("3");
		Thread.sleep(2000);
		se.selectByVisibleText("HTC");
		Thread.sleep(2000);
		List<WebElement> allOptions = se.getOptions();
		for(WebElement webElement : allOptions){
			System.out.println(webElement.getText());
		}
		System.out.println("First Selected Option is : "+se.getFirstSelectedOption().getText());
		Thread.sleep(2000);		
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for(WebElement element : allSelectedOptions){
			System.out.println("Elements in select method : "+element.getText());
		}
		se.deselectByVisibleText("HTC");
		List<WebElement> allSelectedOption = se.getAllSelectedOptions();
		for(WebElement element : allSelectedOption){
			System.out.println("Elements in select method after deselect : "+element.getText());
		}
		driver.close();
	}
}