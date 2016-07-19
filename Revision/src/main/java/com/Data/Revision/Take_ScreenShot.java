package com.Data.Revision;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Take_ScreenShot {

	WebDriver driver;
	@Test
	public void ScreenShot() throws IOException{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		ScreenShot(driver,"goolge.png");
		driver.close();
	}
	public void ScreenShot(WebDriver driver,String name) throws IOException{
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filePath = "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\Revision\\ScreenShots\\" + name;
		FileUtils.copyFile(screenShot, new File(filePath));
	}
}