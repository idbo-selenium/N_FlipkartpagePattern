package com.Data.Revision;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customized_Xpath {

	@Test
	public void CustomizedXpath(){
		WebDriver driver = new FirefoxDriver();
//		driver.get("http://toolsqa.com/selenium-webdriver/choosing-effective-xpath/");
//		String sample = driver.findElement(By.xpath("//*[@class='wpb_wrapper']/p[12]")).getText();
//		System.out.println(sample);
		
		//WebDriver Element Locator firefox Add on
		driver.get("http://toolsqa.com/selenium-webdriver/webdriver-element-locator-firefox-add-on/");
		String sample = driver.findElement(By.xpath("//p[contains(.,'WebDriver Element Locator is a decent add-on for Firefox browser which lets you do just that and save a lot of your time. As this is a add on to Firebox, it is easy to use and to use this, just right click on the web element you wish to locate, select an appropriate locator string and it’ll be copied to your clipboard. It would show multiple options of element locators in your browser’s context menu. It displays the element locator with the complete Selenium script in different languages like C#, Java, Python and Ruby. See below screenshot to see WebDriver Element Locator in action.')]")).getText();
		System.out.println("Sample : "+sample);
	}
}