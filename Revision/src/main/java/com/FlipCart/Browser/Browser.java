package com.FlipCart.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;
	
	public static void Open(){
		driver = new FirefoxDriver();
		//driver = new SafariDriver();
		//driver.manage().window().maximize();
	}
	
	public static void Close(){
		driver.close();
	}
	
	public static WebDriver Driver(){
		return driver;
	}
	public static void Navigate_Back(){
		driver.navigate().back();
	}
}
