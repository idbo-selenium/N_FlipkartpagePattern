package com.Data.Revision;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Tooltips {

	WebDriver driver = null;
	@Before
	public void Init(){
		driver = new FirefoxDriver();		
	}
	
	@After
	public void CleanUp(){
		driver.close();
	}
	
	@Test
	public void PopUp_Handling_SeleniumHQ(){
		driver.navigate().to("http://docs.seleniumhq.org/");
		String tooltipText = driver.findElement(By.cssSelector("html body.homepage div#container div#header h1 a")).getAttribute("title");
		System.out.println("ToolTip Text is : "+tooltipText);
	}
	
	@Test
	public void PopUp_Handling_SpiceJet() throws InterruptedException{
		driver.navigate().to("http://www.spicejet.com/?gclid=CKGCyY7lqMkCFRIfaAodvYEMyQ");
		String tooltipFlightText = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[1]/ul/li[1]/a")).getAttribute("title");
		System.out.println("Flight button ToolTip : "+tooltipFlightText+"\n");
		
		String tooltipFlight_Hotel = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[1]/ul/li[2]/a")).getAttribute("title");
		System.out.println("Flight and Hotel button ToolTip : "+tooltipFlight_Hotel+"\n");
		
		String tooltipHolidayPackage = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[1]/ul/li[3]/a")).getAttribute("title");
		System.out.println("Holiday Packages ToolTip : "+tooltipHolidayPackage+"\n");
		
		String tooltipManageMyBooking = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[1]/ul/li[4]/a")).getAttribute("title");
		System.out.println("Manage my Booking ToolTip : "+tooltipManageMyBooking+"\n");
		
		Actions mouseHover = new Actions(driver);
		
		//Chidren information tooltip
		mouseHover.moveToElement(driver.findElement(By.id("ctl00_mainContent_link"))).build().perform();
		WebElement tooltipChildrenInformation = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[5]/p[2]/a/span"));
		mouseHover.moveToElement(tooltipChildrenInformation).build().perform();
		String childrenToolTipText = tooltipChildrenInformation.getText();
		System.out.println("Children Information ToolTip : "+childrenToolTipText+"\n");
		Thread.sleep(3000);
		
		//Infants are children that are under 2 years old on the date of travel Information tooltip
		mouseHover.moveToElement(driver.findElement(By.id("ctl00_mainContent_link2"))).build().perform();
		WebElement tooltipInfantsInformation = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[5]/p[3]/a/span"));
		mouseHover.moveToElement(tooltipInfantsInformation).build().perform();
		String infantsToolTipText = tooltipInfantsInformation.getText();
		System.out.println("Infants Information ToolTip : "+infantsToolTipText+"\n");
		Thread.sleep(3000);
		
		//it is to perform Indian Armed Forces CheckBox hovering using xpath		
		mouseHover.moveToElement(driver.findElement(By.id("ctl00_mainContent_chk_IndArm"))).build().perform();
		//Indian Armed Forces CheckBox tooltip xpath	
		WebElement tooltipIndianArmedCheckBox = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[6]/div[1]/span"));
		mouseHover.moveToElement(tooltipIndianArmedCheckBox).build().perform();
		String indianArmedCheckBoxToolTipText = tooltipIndianArmedCheckBox.getText();
		System.out.println("Indian Armed Forces CheckBox ToolTip : "+indianArmedCheckBoxToolTipText+"\n");
		Thread.sleep(3000);
		
//		//it is to perform Family and Friends CheckBox hovering using xpath
//		mouseHover.moveToElement(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))).build().perform();
//		//Family and Friends CheckBox tooltip xpath
//		WebElement tooltipFamilyAndFriends = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[7]/div[2]/span"));
//		mouseHover.moveToElement(tooltipFamilyAndFriends).build().perform();
//		String familyAndFriendsCheckBoxToolTipText = tooltipFamilyAndFriends.getText();
//		System.out.println("Family and Friends CheckBox ToolTip : "+familyAndFriendsCheckBoxToolTipText+"\n");
//		Thread.sleep(3000);
		
		//it is to perform Student CheckBox hovering using xpath
		mouseHover.moveToElement(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"))).build().perform();
		//student CheckBox tooltip xpath
		WebElement tooltipStudent = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[6]/div[2]/span"));
		mouseHover.moveToElement(tooltipStudent).build().perform();
		String studentCheckBoxToolTipText = tooltipStudent.getText();
		System.out.println("Student CheckBox ToolTip : "+studentCheckBoxToolTipText+"\n");
		Thread.sleep(3000);
		
		String tooltipFlightStatus = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[3]/ul/li[1]/a")).getAttribute("title");
		System.out.println("Flight Status button ToolTip : "+tooltipFlightStatus+"\n");
		
		String tooltipGroupTraveller = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[3]/ul/li[2]/a")).getAttribute("title");
		System.out.println("Group Traveller button ToolTip : "+tooltipGroupTraveller+"\n");
		
		String tooltipWebCheckIn = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[3]/ul/li[3]/a")).getAttribute("title");
		System.out.println("Web CheckIn button ToolTip : "+tooltipWebCheckIn+"\n");
		Thread.sleep(3000);
		mouseHover.moveToElement(driver.findElement(By.className("spiceFare"))).build().perform();
		WebElement checkIn = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[3]/ul/li[3]/div/div"));
		mouseHover.moveToElement(checkIn);
		String checkInToolTip = checkIn.getText();
		System.out.println("Web CheckIn ToolTip Text : "+checkInToolTip);		
	}
}