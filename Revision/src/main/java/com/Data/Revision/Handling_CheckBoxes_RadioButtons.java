package com.Data.Revision;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_CheckBoxes_RadioButtons {

	WebDriver driver;
	@Test	
	public void CheckBox_RadioButton() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		//one way radio button click
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//leaving from station selelct
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		//Going to station select
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Vishakhapatnam (VTZ)")).click();
		//from date select
		driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		driver.findElement(By.linkText("25")).click();
		//select number of passengers
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[8]/span[2]/input[1]")).click();
	}
}