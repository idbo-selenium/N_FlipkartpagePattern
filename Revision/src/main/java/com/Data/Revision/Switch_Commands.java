package com.Data.Revision;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_Commands {

	WebDriver driver;
	
	@Test
	//handling Windows using getWindowHandle,getWindowHandles
//	public void Handling_Webpages() throws InterruptedException{
//		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
//		String mainWindow = driver.getWindowHandle();
//		System.out.println("mainWindow : "+mainWindow);
//		driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
//		Set<String> handles = driver.getWindowHandles();
//		System.out.println("Handles : "+handles);
//		for(String window : handles){
//			if(!window.equals(mainWindow)){
//				driver.switchTo().window(window);
//				driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);
//				Thread.sleep(4000);
//				driver.quit();
//			}
//		}
//	}          http://www.landrover.com/above-and-beyond/celebrate-defender/index.html
	
	
	
	//count the nun=mber of Iframes in the given site
	public void Handling_Iframes(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		//driver.findElement(By.xpath("")).click();
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of Iframes on the Page are "+numberOfFrames);
		
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframe.size());
		
		/*
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
 
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		*/
	}
}